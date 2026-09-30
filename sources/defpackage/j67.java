package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j67 implements ResponseHandler {
    public final ResponseHandler a;
    public final oye b;
    public final ke9 c;

    public j67(ResponseHandler responseHandler, oye oyeVar, ke9 ke9Var) {
        this.a = responseHandler;
        this.b = oyeVar;
        this.c = ke9Var;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.c.i(this.b.b());
        this.c.d(httpResponse.getStatusLine().getStatusCode());
        Long lA = le9.a(httpResponse);
        if (lA != null) {
            this.c.h(lA.longValue());
        }
        String strB = le9.b(httpResponse);
        if (strB != null) {
            this.c.g(strB);
        }
        this.c.b();
        return this.a.handleResponse(httpResponse);
    }
}
