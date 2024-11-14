package center.helloworld.c3_propertyEditor;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * @author zhishun.cai
 * @date 2024/11/14
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	/**
	 * 重写setAsText方法
	 * @param text  The string to be parsed.
	 * @throws IllegalArgumentException
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if(text != null && !text.equals("")) {
			Address address = new Address();
			String[] arr = text.split("-");
			address.setProvince(arr[0]);
			address.setCity(arr[1]);
			address.setTown(arr[2]);
			setValue(address);
		}
	}
}
