package br.com.rpa.client.coreelements;

import com.google.gwt.dom.client.Element;

public abstract class CoreSelectorItemRenderer<T> {

	public abstract Element render(T item);

}
