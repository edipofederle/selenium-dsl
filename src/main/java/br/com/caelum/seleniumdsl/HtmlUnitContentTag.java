package br.com.caelum.seleniumdsl;

import org.apache.commons.lang.NotImplementedException;

import com.gargoylesoftware.htmlunit.html.HtmlElement;

public class HtmlUnitContentTag implements ContentTag {
    
    private final HtmlElement element;

    public HtmlUnitContentTag(HtmlElement element) {
        this.element = element;
    }

    public boolean contains(String content) {
        throw new NotImplementedException();
    }

    public boolean exists() {
        throw new NotImplementedException();
    }

    /**
     * FIXME returns element html also
     */
    public String innerHTML() {
        return element.asXml();
    }

}