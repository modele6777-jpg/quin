package defpackage;

import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yq3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zq3 b;

    public /* synthetic */ yq3(zq3 zq3Var, int i) {
        this.a = i;
        this.b = zq3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.a) {
            case 0:
                zq3 zq3Var = this.b;
                synchronized (zq3Var) {
                    try {
                        lj6 lj6Var = (lj6) zq3Var.a.get();
                        ArrayList arrayListA = lj6Var.a();
                        synchronized (lj6Var) {
                            lj6Var.a.a(new oz5(lj6Var));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            dp0 dp0Var = (dp0) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", dp0Var.a);
                            jSONObject.put("dates", new JSONArray((Collection) dp0Var.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString(Constants.ENCODING);
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                zq3 zq3Var2 = this.b;
                synchronized (zq3Var2) {
                    lj6 lj6Var2 = (lj6) zq3Var2.a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = ((du3) zq3Var2.c.get()).a();
                    synchronized (lj6Var2) {
                        lj6Var2.a.a(new it3(lj6Var2, lj6.b(jCurrentTimeMillis), strA, new isa(strA)));
                    }
                }
                return null;
        }
    }
}
