package me.toptas.jobseasy.parser;

import java.util.List;

import me.toptas.jobseasy.model.RssItem;

/**
 * Created by faruktoptas on 29/01/17.
 */

public interface OnRssParserListener {

    void onSuccess(List<RssItem> rssItemList, String rssUrl);

    void onFail(String rssUrl);
}
