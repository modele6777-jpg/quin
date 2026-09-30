package com.google.firebase.perf.network;

import defpackage.e4f;
import defpackage.j67;
import defpackage.ke9;
import defpackage.le9;
import defpackage.oye;
import defpackage.ub3;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        oye.e();
        long jA = oye.a();
        ke9 ke9Var = new ke9(e4f.H0);
        try {
            ke9Var.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ke9Var.c(httpRequest.getRequestLine().getMethod());
            Long lA = le9.a(httpRequest);
            if (lA != null) {
                ke9Var.e(lA.longValue());
            }
            long jE = oye.e();
            jA = oye.a();
            ke9Var.f(jE);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            oye.e();
            ke9Var.i(oye.a() - jA);
            ke9Var.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = le9.a(httpResponseExecute);
            if (lA2 != null) {
                ke9Var.h(lA2.longValue());
            }
            String strB = le9.b(httpResponseExecute);
            if (strB != null) {
                ke9Var.g(strB);
            }
            ke9Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            oye.e();
            ke9Var.i(oye.a() - jA);
            le9.c(ke9Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        oye oyeVar = new oye();
        ke9 ke9Var = new ke9(e4f.H0);
        try {
            ke9Var.j(httpUriRequest.getURI().toString());
            ke9Var.c(httpUriRequest.getMethod());
            Long lA = le9.a(httpUriRequest);
            if (lA != null) {
                ke9Var.e(lA.longValue());
            }
            oyeVar.d();
            ke9Var.f(oyeVar.a);
            return (T) httpClient.execute(httpUriRequest, new j67(responseHandler, oyeVar, ke9Var));
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        oye.e();
        long jA = oye.a();
        ke9 ke9Var = new ke9(e4f.H0);
        try {
            ke9Var.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ke9Var.c(httpRequest.getRequestLine().getMethod());
            Long lA = le9.a(httpRequest);
            if (lA != null) {
                ke9Var.e(lA.longValue());
            }
            long jE = oye.e();
            jA = oye.a();
            ke9Var.f(jE);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            oye.e();
            ke9Var.i(oye.a() - jA);
            ke9Var.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = le9.a(httpResponseExecute);
            if (lA2 != null) {
                ke9Var.h(lA2.longValue());
            }
            String strB = le9.b(httpResponseExecute);
            if (strB != null) {
                ke9Var.g(strB);
            }
            ke9Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            oye.e();
            ke9Var.i(oye.a() - jA);
            le9.c(ke9Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        oye.e();
        long jA = oye.a();
        ke9 ke9Var = new ke9(e4f.H0);
        try {
            ke9Var.j(httpUriRequest.getURI().toString());
            ke9Var.c(httpUriRequest.getMethod());
            Long lA = le9.a(httpUriRequest);
            if (lA != null) {
                ke9Var.e(lA.longValue());
            }
            long jE = oye.e();
            jA = oye.a();
            ke9Var.f(jE);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            oye.e();
            ke9Var.i(oye.a() - jA);
            ke9Var.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = le9.a(httpResponseExecute);
            if (lA2 != null) {
                ke9Var.h(lA2.longValue());
            }
            String strB = le9.b(httpResponseExecute);
            if (strB != null) {
                ke9Var.g(strB);
            }
            ke9Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            oye.e();
            ke9Var.i(oye.a() - jA);
            le9.c(ke9Var);
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        oye.e();
        long jA = oye.a();
        ke9 ke9Var = new ke9(e4f.H0);
        try {
            ke9Var.j(httpUriRequest.getURI().toString());
            ke9Var.c(httpUriRequest.getMethod());
            Long lA = le9.a(httpUriRequest);
            if (lA != null) {
                ke9Var.e(lA.longValue());
            }
            long jE = oye.e();
            jA = oye.a();
            ke9Var.f(jE);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            oye.e();
            ke9Var.i(oye.a() - jA);
            ke9Var.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = le9.a(httpResponseExecute);
            if (lA2 != null) {
                ke9Var.h(lA2.longValue());
            }
            String strB = le9.b(httpResponseExecute);
            if (strB != null) {
                ke9Var.g(strB);
            }
            ke9Var.b();
            return httpResponseExecute;
        } catch (IOException e) {
            oye.e();
            ke9Var.i(oye.a() - jA);
            le9.c(ke9Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        oye oyeVar = new oye();
        ke9 ke9Var = new ke9(e4f.H0);
        try {
            ke9Var.j(httpUriRequest.getURI().toString());
            ke9Var.c(httpUriRequest.getMethod());
            Long lA = le9.a(httpUriRequest);
            if (lA != null) {
                ke9Var.e(lA.longValue());
            }
            oyeVar.d();
            ke9Var.f(oyeVar.a);
            return (T) httpClient.execute(httpUriRequest, new j67(responseHandler, oyeVar, ke9Var), httpContext);
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        oye oyeVar = new oye();
        ke9 ke9Var = new ke9(e4f.H0);
        try {
            ke9Var.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ke9Var.c(httpRequest.getRequestLine().getMethod());
            Long lA = le9.a(httpRequest);
            if (lA != null) {
                ke9Var.e(lA.longValue());
            }
            oyeVar.d();
            ke9Var.f(oyeVar.a);
            return (T) httpClient.execute(httpHost, httpRequest, new j67(responseHandler, oyeVar, ke9Var));
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        oye oyeVar = new oye();
        ke9 ke9Var = new ke9(e4f.H0);
        try {
            ke9Var.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            ke9Var.c(httpRequest.getRequestLine().getMethod());
            Long lA = le9.a(httpRequest);
            if (lA != null) {
                ke9Var.e(lA.longValue());
            }
            oyeVar.d();
            ke9Var.f(oyeVar.a);
            return (T) httpClient.execute(httpHost, httpRequest, new j67(responseHandler, oyeVar, ke9Var), httpContext);
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }
}
