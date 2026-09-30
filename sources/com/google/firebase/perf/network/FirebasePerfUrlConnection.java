package com.google.firebase.perf.network;

import defpackage.e4f;
import defpackage.g67;
import defpackage.h67;
import defpackage.ke9;
import defpackage.le9;
import defpackage.oye;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    public static Object getContent(URL url) throws IOException {
        e4f e4fVar = e4f.H0;
        oye oyeVar = new oye();
        oyeVar.d();
        long j = oyeVar.a;
        ke9 ke9Var = new ke9(e4fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new h67((HttpsURLConnection) uRLConnectionOpenConnection, oyeVar, ke9Var).a.b();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new g67((HttpURLConnection) uRLConnectionOpenConnection, oyeVar, ke9Var).a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            ke9Var.f(j);
            ke9Var.i(oyeVar.b());
            ke9Var.j(url.toString());
            le9.c(ke9Var);
            throw e;
        }
    }

    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new h67((HttpsURLConnection) obj, new oye(), new ke9(e4f.H0));
        }
        return obj instanceof HttpURLConnection ? new g67((HttpURLConnection) obj, new oye(), new ke9(e4f.H0)) : obj;
    }

    public static InputStream openStream(URL url) throws IOException {
        e4f e4fVar = e4f.H0;
        oye oyeVar = new oye();
        if (!e4fVar.c.get()) {
            return url.openConnection().getInputStream();
        }
        oyeVar.d();
        long j = oyeVar.a;
        ke9 ke9Var = new ke9(e4fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new h67((HttpsURLConnection) uRLConnectionOpenConnection, oyeVar, ke9Var).a.e();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new g67((HttpURLConnection) uRLConnectionOpenConnection, oyeVar, ke9Var).a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            ke9Var.f(j);
            ke9Var.i(oyeVar.b());
            ke9Var.j(url.toString());
            le9.c(ke9Var);
            throw e;
        }
    }

    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        e4f e4fVar = e4f.H0;
        oye oyeVar = new oye();
        oyeVar.d();
        long j = oyeVar.a;
        ke9 ke9Var = new ke9(e4fVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new h67((HttpsURLConnection) uRLConnectionOpenConnection, oyeVar, ke9Var).a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new g67((HttpURLConnection) uRLConnectionOpenConnection, oyeVar, ke9Var).a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            ke9Var.f(j);
            ke9Var.i(oyeVar.b());
            ke9Var.j(url.toString());
            le9.c(ke9Var);
            throw e;
        }
    }
}
