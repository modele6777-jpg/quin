package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i67 {
    public static final ct f = ct.d();
    public final HttpURLConnection a;
    public final ke9 b;
    public long c = -1;
    public long d = -1;
    public final oye e;

    public i67(HttpURLConnection httpURLConnection, oye oyeVar, ke9 ke9Var) {
        this.a = httpURLConnection;
        this.b = ke9Var;
        this.e = oyeVar;
        ke9Var.j(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        ke9 ke9Var = this.b;
        oye oyeVar = this.e;
        if (j == -1) {
            oyeVar.d();
            long j2 = oyeVar.a;
            this.c = j2;
            ke9Var.f(j2);
        }
        try {
            this.a.connect();
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public final Object b() throws IOException {
        oye oyeVar = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        ke9 ke9Var = this.b;
        ke9Var.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                ke9Var.g(httpURLConnection.getContentType());
                return new e67((InputStream) content, ke9Var, oyeVar);
            }
            ke9Var.g(httpURLConnection.getContentType());
            ke9Var.h(httpURLConnection.getContentLength());
            ke9Var.i(oyeVar.b());
            ke9Var.b();
            return content;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        oye oyeVar = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        ke9 ke9Var = this.b;
        ke9Var.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                ke9Var.g(httpURLConnection.getContentType());
                return new e67((InputStream) content, ke9Var, oyeVar);
            }
            ke9Var.g(httpURLConnection.getContentType());
            ke9Var.h(httpURLConnection.getContentLength());
            ke9Var.i(oyeVar.b());
            ke9Var.b();
            return content;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.a;
        ke9 ke9Var = this.b;
        i();
        try {
            ke9Var.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new e67(errorStream, ke9Var, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        oye oyeVar = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        ke9 ke9Var = this.b;
        ke9Var.d(responseCode);
        ke9Var.g(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new e67(inputStream, ke9Var, oyeVar) : inputStream;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        oye oyeVar = this.e;
        ke9 ke9Var = this.b;
        try {
            OutputStream outputStream = this.a.getOutputStream();
            return outputStream != null ? new f67(outputStream, ke9Var, oyeVar) : outputStream;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.d;
        oye oyeVar = this.e;
        ke9 ke9Var = this.b;
        if (j == -1) {
            long jB = oyeVar.b();
            this.d = jB;
            fe9 fe9Var = ke9Var.d;
            fe9Var.i();
            ((je9) fe9Var.b).W(jB);
        }
        try {
            int responseCode = this.a.getResponseCode();
            ke9Var.d(responseCode);
            return responseCode;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.a;
        i();
        long j = this.d;
        oye oyeVar = this.e;
        ke9 ke9Var = this.b;
        if (j == -1) {
            long jB = oyeVar.b();
            this.d = jB;
            fe9 fe9Var = ke9Var.d;
            fe9Var.i();
            ((je9) fe9Var.b).W(jB);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            ke9Var.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        long j = this.c;
        ke9 ke9Var = this.b;
        if (j == -1) {
            oye oyeVar = this.e;
            oyeVar.d();
            long j2 = oyeVar.a;
            this.c = j2;
            ke9Var.f(j2);
        }
        HttpURLConnection httpURLConnection = this.a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            ke9Var.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            ke9Var.c("POST");
        } else {
            ke9Var.c("GET");
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
