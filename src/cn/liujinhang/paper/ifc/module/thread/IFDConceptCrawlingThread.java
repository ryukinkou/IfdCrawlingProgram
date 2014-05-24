package cn.liujinhang.paper.ifc.module.thread;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import no.catenda.peregrine.model.objects.json.IfdConcept;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.liujinhang.paper.ifc.system.Constant;
import cn.liujinhang.paper.ifc.system.ObjectMapperFactory;

public class IFDConceptCrawlingThread extends BaseThread {

	private String keyword;

	private String guid;

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public List<IfdConcept> call() throws Exception {

		if (null != guid) {
			return this.queryByGuid(guid);
		}

		if (null != keyword) {
			return this.search(keyword);
		}

		return null;
	}

	private List<IfdConcept> queryByGuid(String guid) throws Exception {

		URL url = new URL(Constant.BSDD_BASE_URL + "/IfdConcept/" + guid);

		URLConnection connection = url.openConnection();

		connection.setRequestProperty("accept", "application/json");
		connection.setDoOutput(true);

		List<IfdConcept> result = this.decodeJsonToEntities(
				connection.getInputStream(), "IfdConcept");

		return result;
	}

	private List<IfdConcept> search(String keyword) throws Exception {

		URL url = new URL(Constant.BSDD_BASE_URL + "/IfdConcept/search/"
				+ keyword);

		URLConnection connection = url.openConnection();
		connection.setRequestProperty("accept", "application/json");
		connection.setDoOutput(true);

		List<IfdConcept> result = this.decodeJsonToEntities(
				connection.getInputStream(), "IfdConcept");

		return result;
	}

	protected List<IfdConcept> decodeJsonToEntities(InputStream inputStream,
			String rootNode) {

		ObjectMapper mapper = ObjectMapperFactory.getInstance();
		List<IfdConcept> result = null;

		try {

			JsonNode ifdConceptNode = mapper.readTree(inputStream)
					.get(rootNode);
			if (null != ifdConceptNode && ifdConceptNode.size() > 0) {

				TypeReference<List<IfdConcept>> typeReference = new TypeReference<List<IfdConcept>>() {
				};
				result = mapper.readValue(ifdConceptNode.traverse(),
						typeReference);
			}
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}

	}

}
