package defpackage;

import android.content.Intent;
import android.content.pm.Signature;
import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import io.sentry.e1;
import io.sentry.g4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jv2 implements na1, ye, vc0, vae, kw6, j8e, ObjectConstructor, g4, mu3, bc2, yn2, kn9, c98, xt3, oh5, cu2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jv2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 19:
                ((ks2) obj2).d(obj);
                break;
            default:
                ((xy2) obj2).d(obj);
                break;
        }
    }

    @Override // defpackage.vc0
    public int b(int i, cv7 cv7Var) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 2:
                return ((kx0) obj).a(0, i);
            default:
                return ((jx0) obj).a(0, i, cv7Var);
        }
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        return ((CrashlyticsRegistrar) this.b).buildCrashlytics(hbcVar);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return ConstructorConstructor.lambda$newUnsafeAllocator$19((Class) obj);
            default:
                return ConstructorConstructor.lambda$newDefaultConstructor$9((Constructor) obj);
        }
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 22:
                ((sp8) ((ql) obj)).o = (lga) obj2;
                break;
            case 23:
                qm3 qm3Var = (qm3) obj2;
                sp8 sp8Var = (sp8) ((ql) obj);
                sp8Var.y += qm3Var.g;
                sp8Var.z += qm3Var.e;
                break;
            case 24:
            case 25:
            case 26:
            default:
                ((xga) obj).p((u03) obj2);
                break;
            case 27:
                ((xga) obj).v((rp8) obj2);
                break;
            case 28:
                ((xga) obj).e((q1f) obj2);
                break;
        }
    }

    @Override // defpackage.vae
    public void e(lq0 lq0Var) {
        ((s0e) this.b).m(lq0Var);
    }

    @Override // defpackage.oh5
    public void f(float f) {
        nuf nufVar = ((iuf) this.b).b;
        if (nufVar.f == f) {
            return;
        }
        nufVar.f = f;
        nufVar.c(false);
    }

    @Override // io.sentry.g4
    public void g(e1 e1Var) {
        Object dzbVar;
        Exception exc = (Exception) this.b;
        e1Var.getClass();
        String message = exc.getMessage();
        if (message == null) {
            message = "somethings go wrong";
        }
        e1Var.m("msg", message);
        try {
            dzbVar = s.J(cn1.z());
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        Signature[] signatureArr = (Signature[]) dzbVar;
        e1Var.m("signatures", signatureArr != null ? qd0.t0(signatureArr, null, null, null, new cz1(25), 31) : "unknown");
        for (iy9 iy9Var : rs0.s(exc)) {
            e1Var.m((String) iy9Var.a(), (String) iy9Var.b());
        }
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                return CrashlyticsWorker.lambda$submit$1((Runnable) obj, task);
            default:
                return CrashlyticsWorker.lambda$submitTaskOnSuccess$5((j8e) obj, task);
        }
    }

    @Override // defpackage.mu3
    public void i(i1b i1bVar) {
        ((CrashlyticsNativeComponentDeferredProxy) this.b).lambda$new$0(i1bVar);
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        Uri data;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((a26) ((e89) obj2).getValue()).d(obj);
                break;
            default:
                iz2 iz2Var = (iz2) obj2;
                xe xeVar = (xe) obj;
                CropImageActivity cropImageActivity = (CropImageActivity) iz2Var.b.b;
                xeVar.getClass();
                if (xeVar.a != -1) {
                    cropImageActivity.w();
                } else {
                    Intent intent = xeVar.b;
                    if (intent == null || (data = intent.getData()) == null) {
                        data = iz2Var.e;
                    }
                    if (data != null) {
                        cropImageActivity.Q0 = data;
                        CropImageView cropImageView = cropImageActivity.S0;
                        if (cropImageView != null) {
                            cropImageView.setImageUriAsync(data);
                        }
                    } else {
                        cropImageActivity.w();
                    }
                }
                break;
        }
    }

    @Override // defpackage.xt3
    public yob k(int i, h1f h1fVar, int[] iArr) {
        vt3 vt3Var = (vt3) this.b;
        dy6 dy6VarM = jy6.m();
        for (int i2 = 0; i2 < h1fVar.a; i2++) {
            dy6VarM.b(new st3(i, h1fVar, i2, vt3Var, iArr[i2]));
        }
        return dy6VarM.g();
    }

    @Override // defpackage.kw6
    public void l(lw6 lw6Var) throws Exception {
        hbc hbcVar = (hbc) this.b;
        try {
            iw6 iw6VarQ = lw6Var.q();
            StringBuilder sb = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = ");
            uva uvaVar = (uva) hbcVar.a;
            sb.append(uvaVar == null ? null : Integer.valueOf(uvaVar.a));
            sb.append(", image.isNull = ");
            sb.append(iw6VarQ == null);
            b21.q("CaptureNode", sb.toString());
            if (iw6VarQ != null) {
                hbcVar.t0(iw6VarQ);
                return;
            }
            uva uvaVar2 = (uva) hbcVar.a;
            if (uvaVar2 != null) {
                hbcVar.F0(new nq0(uvaVar2.a, new jv6(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e) {
            uva uvaVar3 = (uva) hbcVar.a;
            if (uvaVar3 != null) {
                hbcVar.F0(new nq0(uvaVar3.a, new jv6(2, "Failed to acquire latest image", e)));
            }
        }
    }

    public ri1 m(ta0 ta0Var) throws IOException {
        tu1 tu1Var = (tu1) this.b;
        URL url = (URL) ta0Var.c;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) ta0Var.b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    m6c m6cVar = tu1Var.a;
                    go0 go0Var = (go0) ta0Var.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    hh7 hh7Var = (hh7) m6cVar.b;
                    mj7 mj7Var = new mj7(bufferedWriter, hh7Var.a, hh7Var.b, hh7Var.c, hh7Var.d);
                    mj7Var.h(go0Var);
                    mj7Var.j();
                    mj7Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    g21.I("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    g21.I("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new ri1(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new ri1(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            ri1 ri1Var = new ri1(responseCode, null, op0.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return ri1Var;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e) {
            e = e;
            g21.K("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ri1(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            g21.K("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ri1(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            g21.K("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ri1(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
        } catch (kv4 e4) {
            e = e4;
            g21.K("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ri1(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
        }
    }

    @Override // defpackage.j8e
    public Task then(Object obj) {
        return Tasks.d((bi2) this.b);
    }

    @Override // defpackage.cu2
    public Object v(Object obj) {
        cu2 cu2Var = (cu2) this.b;
        vyb vybVar = (vyb) obj;
        oq8 oq8VarL = vybVar.l();
        String strU = vybVar.u();
        try {
            tyb tybVar = vyb.b;
            return cu2Var.v(uyb.p(strU, oq8VarL));
        } catch (Exception e) {
            throw new xyb(e, strU);
        }
    }

    @Override // defpackage.na1
    public Object x(la1 la1Var) {
        m88 m88VarT;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rg7) obj).E(new ot1(6, la1Var));
                return "Job.asListenableFuture";
            case 5:
                vi1 vi1Var = (vi1) obj;
                synchronized (vi1Var.a) {
                    vi1Var.e = la1Var;
                    break;
                }
                return "CameraRepository-deinit";
            default:
                rk1 rk1Var = (rk1) obj;
                rk1Var.n.f();
                if (rk1Var.o.b()) {
                    u6c u6cVar = (u6c) rk1Var.o.getValue();
                    synchronized (u6cVar.a) {
                        u6cVar.b.disable();
                        u6cVar.c.clear();
                        u6cVar.d = -1;
                    }
                }
                vi1 vi1Var2 = rk1Var.a;
                synchronized (vi1Var2.a) {
                    try {
                        boolean zIsEmpty = vi1Var2.b.isEmpty();
                        m88VarT = vi1Var2.d;
                        if (!zIsEmpty) {
                            if (m88VarT == null) {
                                m88VarT = y41.t(new jv2(5, vi1Var2));
                                vi1Var2.d = m88VarT;
                            }
                            vi1Var2.c.addAll(vi1Var2.b.values());
                            for (pg1 pg1Var : vi1Var2.b.values()) {
                                pg1Var.a().b(new fe(18, vi1Var2, pg1Var), g94.a());
                            }
                            vi1Var2.b.clear();
                        } else if (m88VarT == null) {
                            m88VarT = tx6.c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                m88VarT.b(new fe(20, rk1Var, la1Var), rk1Var.d);
                return "CameraX shutdownInternal";
        }
    }

    public /* synthetic */ jv2(pl plVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
