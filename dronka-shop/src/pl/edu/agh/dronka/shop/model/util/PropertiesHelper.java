package pl.edu.agh.dronka.shop.model.util;

import java.util.LinkedHashMap;
import java.util.Map;

import pl.edu.agh.dronka.shop.model.Category;
import pl.edu.agh.dronka.shop.model.Item;

public class PropertiesHelper {

	public static Map<String, Object> getPropertiesMap(Item item) {
		Map<String, Object> propertiesMap = new LinkedHashMap<>();
		
		propertiesMap.put("Nazwa", item.getName());
		propertiesMap.put("Cena", item.getPrice());
		propertiesMap.put("Kategoria", item.getCategory().getDisplayName()); 
		propertiesMap.put("Ilość", Integer.toString(item.getQuantity()));
		propertiesMap.put("Tanie bo polskie", item.isPolish());
		propertiesMap.put("Używany", item.isSecondhand());

		if (item.getCategory() == Category.BOOKS) {
			propertiesMap.put("Liczba stron", Integer.toString(item.getNoPages()));
			propertiesMap.put("Twarda oprawa", item.isHardcover());
		}

		if (item.getCategory() == Category.ELECTRONICS) {
			propertiesMap.put("Mobilny", item.isMobile());
			propertiesMap.put("Gwarancja", item.isGuarantee());
		}

		if (item.getCategory() == Category.FOOD) {
			propertiesMap.put("Data przydatności do spożycia", item.getExpiryDate().toString());
		}

		if (item.getCategory() == Category.MUSIC) {
			propertiesMap.put("Gatunek muzyczny", item.getGenre().toString());
			propertiesMap.put("Dołączone video", item.isAttachedVideo());
		}
		
		return propertiesMap;
	}
}
