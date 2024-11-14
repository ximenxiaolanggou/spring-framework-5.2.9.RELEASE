package center.helloworld.c3_propertyEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author zhishun.cai
 * @date 2024/11/14
 */
public class AddressPropertyRegister implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class, new AddressPropertyEditor());
	}
}
