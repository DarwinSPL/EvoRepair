package de.evorepair.evolution.operation.valueconverter

import java.text.SimpleDateFormat
import java.util.Date
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter
import org.eclipse.xtext.nodemodel.INode

class EvoOperationValueConverter extends DefaultTerminalConverters{
	val format = new SimpleDateFormat("\"yyyy/MM/dd HH:mm:ss\"");
	
	@ValueConverter(rule = "DATE")
	def IValueConverter<Date> DateValue() {
		return new AbstractNullSafeConverter<Date>(){
			
			override protected internalToString(Date value) {
				return format.format(value)
			}
			
			override protected internalToValue(String string, INode node) throws ValueConverterException {
				return format.parse(string);
			}
			
		}
	}
}