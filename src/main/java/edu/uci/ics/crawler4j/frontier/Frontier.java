package edu.uci.ics.crawler4j.frontier;

import edu.uci.ics.crawler4j.url.WebURL;

import java.util.List;

public interface Frontier {
    List<WebURL> getNextURLs();

    void scheduleAll(List<WebURL> urls);

    void schedule(WebURL url);

    boolean isShutdown();

    void shutdown();
}
