package net.leanix.dropkit.apiclient.auth;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException;
}
