package br.com.caelum.seleniumdsl.hamcrest;

import org.hamcrest.Matcher;

import br.com.caelum.seleniumdsl.ContentTag;
import br.com.caelum.seleniumdsl.Form;
import br.com.caelum.seleniumdsl.Page;
import br.com.caelum.seleniumdsl.SelectField;
import br.com.caelum.seleniumdsl.table.Column;
import br.com.caelum.seleniumdsl.table.Table;

public class SeleniumDslMatchers {
	private SeleniumDslMatchers() {}

	public static <T extends ContentTag> Matcher<T> divExists() {
		return DivExistsMatcher.<T>divExists();
	}

	public static <T extends ContentTag> Matcher<T> divContains(String text) {
		return DivContainsMatcher.<T>divContains(text);
	}

	public static <T extends Form> Matcher<T> isChecked(String checkbox) {
		return IsCheckedMatcher.isChecked(checkbox);
	}

	public static <T extends Page> Matcher<T> hasLink(String linkName) {
		return HasLinkMatcher.hasLink(linkName);
	}

	public static <T extends SelectField> Matcher<T> containsOption(String label) {
		return ContainsOptionMatcher.containsOption(label);
	}

	public static <T extends Table> Matcher<T> containsColumn(String name) {
		return ContainsColumnMatcher.containsColumn(name);
	}

	public static <T extends Column> Matcher<T> columnContains(String text) {
		return ColumnContainsMatcher.columnContains(text);
	}
	public static <T extends Column> Matcher<T> columnContainsPartial(String text) {
		return ColumnContainsPartialMatcher.columnContainsPartial(text);
	}
}