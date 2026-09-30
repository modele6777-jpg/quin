package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import com.adjust.sdk.GooglePlayInstallReferrerDetails;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.OnGooglePlayInstallReferrerReadListener;
import com.adjust.sdk.ReferrerDetails;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class kd9 implements InstallReferrerReadListener, x7e, b22, f1b, na1, m23, s36, f8e, is7, avf {
    public static final j56 c = new j56(1);
    public final /* synthetic */ int a;
    public Object b;

    public kd9(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new u6(this);
                break;
            case 4:
                this.b = new AtomicReference(null);
                break;
            case 7:
                this.b = t0e.a(zaf.b);
                break;
            case 9:
                this.b = new HashMap();
                break;
            case 18:
                this.b = new HashSet();
                break;
            case 20:
                this.b = new d0a();
                break;
            case 27:
                k9b k9bVar = s74.a;
                this.b = (ExtraCroppingQuirk) s74.a().b(ExtraCroppingQuirk.class);
                break;
            default:
                st8 st8Var = c;
                v0b v0bVar = v0b.c;
                try {
                    st8Var = (st8) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                }
                st8[] st8VarArr = {j56.b, st8Var};
                bl8 bl8Var = new bl8();
                bl8Var.a = st8VarArr;
                Charset charset = r87.a;
                this.b = bl8Var;
                break;
        }
    }

    public static String B(String str, id5 id5Var, boolean z) {
        String strI = id5Var.extension;
        if (z) {
            strI = ub3.i(".temp", strI);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strI.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return ib8.j("lottie_cache_", strReplaceAll, strI);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.ArrayList K(defpackage.kd9 r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd9.K(kd9, java.lang.String):java.util.ArrayList");
    }

    public void A(long j) {
        long jB = wue.b(j);
        byte b = 0;
        if (!xue.a(jB, 0L)) {
            if (xue.a(jB, 4294967296L)) {
                b = 1;
            } else if (xue.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        y(b);
        if (xue.a(wue.b(j), 0L)) {
            return;
        }
        z(wue.c(j));
    }

    public t6 C(int i) {
        return null;
    }

    public hr8 D(sw6 sw6Var, gr8 gr8Var, ykd ykdVar, zdc zdcVar) {
        hr8 hr8Var;
        int iAbs;
        hr8 hr8Var2;
        m81 m81Var = sw6Var.i;
        bpa bpaVar = sw6Var.q;
        if (m81Var.a()) {
            qib qibVarC = ((mib) this.b).c();
            if (qibVarC != null) {
                synchronized (qibVarC.c) {
                    try {
                        uib uibVar = (uib) ((LinkedHashMap) ((y21) qibVarC.a.c).c).get(gr8Var);
                        hr8Var = uibVar != null ? new hr8(uibVar.a, uibVar.b) : null;
                        if (hr8Var == null) {
                            sug sugVar = qibVarC.b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) sugVar.c).get(gr8Var);
                            if (arrayList == null) {
                                hr8Var = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        hr8Var2 = null;
                                        break;
                                    }
                                    wib wibVar = (wib) arrayList.get(i);
                                    bv6 bv6Var = (bv6) wibVar.a.get();
                                    hr8Var2 = bv6Var != null ? new hr8(bv6Var, wibVar.b) : null;
                                    if (hr8Var2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                sugVar.g();
                                hr8Var = hr8Var2;
                            }
                        }
                        if (hr8Var != null && !hr8Var.a.b()) {
                            synchronized (qibVarC.c) {
                                y21 y21Var = (y21) qibVarC.a.c;
                                Object objRemove = ((LinkedHashMap) y21Var.c).remove(gr8Var);
                                if (objRemove != null) {
                                    y21Var.b = y21Var.g() - y21Var.k(gr8Var, objRemove);
                                    y21Var.e(gr8Var, objRemove, null);
                                }
                                if (objRemove != null) {
                                }
                                if (((LinkedHashMap) qibVarC.b.c).remove(gr8Var) != null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                hr8Var = null;
            }
            if (hr8Var != null) {
                bv6 bv6Var2 = hr8Var.a;
                gz0 gz0Var = bv6Var2 instanceof gz0 ? (gz0) bv6Var2 : null;
                if (gz0Var != null) {
                    Bitmap.Config config = gz0Var.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (qk2.G(config) && !((Boolean) b21.z(sw6Var, yw6.f)).booleanValue()) {
                        return null;
                    }
                }
                String str = (String) gr8Var.b.get("coil#size");
                if (str == null) {
                    Object obj = hr8Var.b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    if ((bool != null ? bool.booleanValue() : false) || (!pa7.t(ykdVar, ykd.c) && bpaVar != bpa.b)) {
                        int iD = bv6Var2.d();
                        int iC = bv6Var2.c();
                        ykd ykdVar2 = bv6Var2 instanceof gz0 ? (ykd) b21.z(sw6Var, vw6.b) : ykd.c;
                        b94 b94Var = ykdVar.a;
                        int i2 = b94Var instanceof z84 ? ((z84) b94Var).a : Integer.MAX_VALUE;
                        b94 b94Var2 = ykdVar2.a;
                        int iMin = Math.min(i2, b94Var2 instanceof z84 ? ((z84) b94Var2).a : Integer.MAX_VALUE);
                        b94 b94Var3 = ykdVar.b;
                        int i3 = b94Var3 instanceof z84 ? ((z84) b94Var3).a : Integer.MAX_VALUE;
                        b94 b94Var4 = ykdVar2.b;
                        int iMin2 = Math.min(i3, b94Var4 instanceof z84 ? ((z84) b94Var4).a : Integer.MAX_VALUE);
                        double d = ((double) iMin) / ((double) iD);
                        double d2 = ((double) iMin2) / ((double) iC);
                        int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? zdc.b : zdcVar).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                ap.c();
                                return null;
                            }
                            if (d < d2) {
                                iAbs = Math.abs(iMin - iD);
                            } else {
                                iAbs = Math.abs(iMin2 - iC);
                                d = d2;
                            }
                        } else if (d > d2) {
                            iAbs = Math.abs(iMin - iD);
                        } else {
                            iAbs = Math.abs(iMin2 - iC);
                            d = d2;
                        }
                        if (iAbs > 1) {
                            int iOrdinal2 = bpaVar.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    ap.c();
                                    return null;
                                }
                                if (d <= 1.0d) {
                                }
                            } else if (d == 1.0d) {
                            }
                        }
                    }
                    return hr8Var;
                }
                if (str.equals(ykdVar.toString())) {
                    return hr8Var;
                }
            }
        }
        return null;
    }

    public File E(String str) {
        File file = new File(J(), B(str, id5.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(J(), B(str, id5.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(J(), B(str, id5.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public i0e F() {
        return (i0e) ((s0e) this.b).getValue();
    }

    public h0e G() {
        jt4 jt4VarA = jt4.a();
        if (jt4VarA.c() == 1) {
            return new wx6(true);
        }
        vz9 vz9VarF = q1c.f(Boolean.FALSE);
        jt4VarA.h(new dr3(vz9VarF, this));
        return vz9VarF;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    public gr8 H(sw6 sw6Var, Object obj, as9 as9Var, uz4 uz4Var) {
        String str;
        String strE;
        m81 m81Var = sw6Var.i;
        Map map = sw6Var.d;
        if (m81Var != m81.b) {
            List list = ((mib) this.b).e.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    iy9 iy9Var = (iy9) list.get(i);
                    uu uuVar = (uu) iy9Var.a();
                    if (((em7) iy9Var.b()).D(obj)) {
                        uuVar.getClass();
                        switch (uuVar.a) {
                            case 0:
                                qhf qhfVar = (qhf) obj;
                                if (!pa7.t(qhfVar.c, "android.resource")) {
                                    str = null;
                                } else {
                                    Configuration configuration = as9Var.a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = erf.a;
                                    str = qhfVar + ":" + (configuration.uiMode & 48);
                                }
                                break;
                            case 1:
                                qhf qhfVar2 = (qhf) obj;
                                String str2 = qhfVar2.c;
                                if (!(str2 == null || str2.equals("file")) || qhfVar2.e == null) {
                                    str = null;
                                } else {
                                    Bitmap.Config[] configArr2 = erf.a;
                                    if ((pa7.t(qhfVar2.c, "file") && pa7.t(s72.x0(afc.f(qhfVar2)), "android_asset")) || !((Boolean) b21.A(as9Var, vw6.c)).booleanValue() || (strE = afc.e(qhfVar2)) == null) {
                                        str = null;
                                    } else {
                                        zd5 zd5Var = as9Var.f;
                                        String str3 = e1a.b;
                                        str = qhfVar2 + "-" + ((Long) zd5Var.R(y25.r(strE)).g);
                                    }
                                }
                                break;
                            default:
                                str = ((qhf) obj).a;
                                break;
                        }
                        if (str != null) {
                        }
                    }
                    i++;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (((List) b21.z(sw6Var, vw6.a)).isEmpty()) {
                    return new gr8(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", as9Var.b.toString());
                return new gr8(str, linkedHashMap);
            }
        }
        return null;
    }

    public void I(uc1 uc1Var) {
        if (uc1Var.b) {
            return;
        }
        vd6 vd6Var = (vd6) this.b;
        synchronized (vd6Var.d) {
            vd6Var.d.remove(uc1Var);
        }
    }

    public File J() {
        File file = new File(((cu7) this.b).a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public boolean L(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    public void M(i0e i0eVar) {
        Object value;
        i0e i0eVar2;
        i0eVar.getClass();
        s0e s0eVar = (s0e) this.b;
        do {
            value = s0eVar.getValue();
            i0eVar2 = (i0e) value;
            if ((i0eVar2 instanceof odb) || pa7.t(i0eVar2, zaf.b)) {
                i0eVar2 = i0eVar;
            } else if (i0eVar2 instanceof cb3) {
                if (i0eVar.a > ((cb3) i0eVar2).a) {
                    i0eVar2 = i0eVar;
                }
            } else if (!(i0eVar2 instanceof we5)) {
                if (i0eVar2 instanceof qf9) {
                    qc0.p("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return;
                } else {
                    ap.c();
                    return;
                }
            }
        } while (!s0eVar.l(value, i0eVar2));
    }

    public void N(int i, Object obj, gfc gfcVar) {
        m72 m72Var = (m72) this.b;
        m72Var.B(i, 3);
        gfcVar.i((vt8) obj, m72Var.a);
        m72Var.B(i, 4);
    }

    public File O(String str, InputStream inputStream, id5 id5Var) throws IOException {
        File file = new File(J(), B(str, id5Var, true));
        try {
            FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file), file);
            try {
                byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStreamE.flush();
                        fileOutputStreamE.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStreamE.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStreamE.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Override // defpackage.s36
    public void a(Object obj) {
    }

    @Override // defpackage.avf
    public int b(View view) {
        return (view.getLeft() - ((ukb) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((ukb) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.x7e
    public int c(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.x7e
    public long f(int i) {
        pa7.A(i == 0);
        return 0L;
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ff5 ff5Var = (ff5) ((ze) this.b).a;
                ff5Var.getClass();
                p0d p0dVar = p0d.a;
                return p0d.a(ff5Var);
            default:
                return new k0d((t0d) ((f1b) this.b).get());
        }
    }

    @Override // defpackage.is7
    public void h(t99 t99Var, Object obj) {
        rdb rdbVar = (rdb) this.b;
        String strB = t99Var.b();
        if ("k".equals(strB)) {
            if (obj instanceof Integer) {
                yr7.a.getClass();
                yr7 yr7Var = (yr7) yr7.b.get((Integer) obj);
                if (yr7Var == null) {
                    yr7Var = yr7.UNKNOWN;
                }
                rdbVar.g = yr7Var;
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                rdbVar.a = (int[]) obj;
            }
        } else {
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    rdbVar.b = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strB)) {
                "pn".equals(strB);
            } else if (obj instanceof Integer) {
                rdbVar.c = ((Integer) obj).intValue();
            }
        }
    }

    @Override // defpackage.s36
    public void i(Throwable th) {
        Object obj;
        di2 di2Var = (di2) this.b;
        int i = 6;
        m45 m45Var = new m45(i, di2Var);
        if (p8c.t()) {
            m45Var.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ok8.o("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new xu8(20, m45Var, countDownLatch)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new y97(e);
            }
        }
        rk1 rk1Var = (rk1) di2Var.d;
        if (rk1Var != null) {
            rk1Var.getClass();
            uh1 uh1Var = rk1Var.n;
            uh1Var.getClass();
            x72.i0(new c1(27, di2Var), uh1Var.n);
            rk1 rk1Var2 = (rk1) di2Var.d;
            rk1Var2.getClass();
            synchronized (rk1Var2.b) {
                try {
                    rk1Var2.e.removeCallbacksAndMessages("retry_token");
                    int iB = kv2.B(rk1Var2.p);
                    if (iB == 0) {
                        rk1Var2.p = 5;
                        obj = tx6.c;
                    } else {
                        if (iB == 1) {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                        if (iB == 2 || iB == 3) {
                            rk1Var2.p = 5;
                            rk1.a(rk1Var2.r);
                            rk1Var2.q = y41.t(new jv2(i, rk1Var2));
                        }
                        obj = rk1Var2.q;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            obj = tx6.c;
        }
        obj.getClass();
        synchronized (di2Var.a) {
            di2Var.b = null;
            di2Var.c = obj;
            ((HashMap) di2Var.g).clear();
            ((HashSet) di2Var.v).clear();
        }
        di2Var.j(null, null);
    }

    @Override // defpackage.x7e
    public List j(long j) {
        return j >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // defpackage.avf
    public int k() {
        return ((tkb) this.b).y();
    }

    @Override // defpackage.x7e
    public int l() {
        return 1;
    }

    @Override // defpackage.is7
    public js7 n(t99 t99Var) {
        String strB = t99Var.b();
        if ("d1".equals(strB)) {
            return new pdb(this, 0);
        }
        if ("d2".equals(strB)) {
            return new pdb(this, 1);
        }
        return null;
    }

    @Override // defpackage.avf
    public int o() {
        tkb tkbVar = (tkb) this.b;
        return tkbVar.m - tkbVar.z();
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onFail(String str) {
        ((OnGooglePlayInstallReferrerReadListener) this.b).onFail(str);
    }

    @Override // com.adjust.sdk.InstallReferrerReadListener
    public void onInstallReferrerRead(ReferrerDetails referrerDetails, String str) {
        ((OnGooglePlayInstallReferrerReadListener) this.b).onInstallReferrerRead(new GooglePlayInstallReferrerDetails(referrerDetails));
    }

    @Override // defpackage.m23
    public Iterable q(Object obj) {
        bk7 bk7Var = (bk7) this.b;
        Collection collectionE = ((u09) obj).h().e();
        collectionE.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            y22 y22VarM = ((tt7) it.next()).c0().m();
            u09 u09VarA = null;
            y22 y22VarA = y22VarM != null ? y22VarM.a() : null;
            u09 u09Var = y22VarA instanceof u09 ? (u09) y22VarA : null;
            if (u09Var != null && (u09VarA = bk7Var.a(u09Var)) == null) {
                u09VarA = u09Var;
            }
            if (u09VarA != null) {
                arrayList.add(u09VarA);
            }
        }
        return arrayList;
    }

    @Override // defpackage.b22
    public a22 r(j22 j22Var) {
        a22 a22VarR;
        j22Var.getClass();
        nw9 nw9Var = (nw9) this.b;
        dx5 dx5Var = j22Var.a;
        dx5Var.getClass();
        ArrayList<kw9> arrayList = new ArrayList();
        nw9Var.b(dx5Var, arrayList);
        for (kw9 kw9Var : arrayList) {
            if ((kw9Var instanceof k51) && (a22VarR = ((k51) kw9Var).x.r(j22Var)) != null) {
                return a22VarR;
            }
        }
        return null;
    }

    @Override // defpackage.f8e
    public void s(byte[] bArr, int i, int i2, e8e e8eVar, xl2 xl2Var) {
        t03 t03VarA;
        d0a d0aVar = (d0a) this.b;
        d0aVar.K(bArr, i2 + i);
        d0aVar.M(i);
        ArrayList arrayList = new ArrayList();
        while (d0aVar.a() > 0) {
            pa7.z("Incomplete Mp4Webvtt Top Level box header found.", d0aVar.a() >= 8);
            int iM = d0aVar.m();
            if (d0aVar.m() == 1987343459) {
                int i3 = iM - 8;
                CharSequence charSequenceF = null;
                s03 s03VarA = null;
                while (i3 > 0) {
                    pa7.z("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM2 = d0aVar.m();
                    int iM3 = d0aVar.m();
                    int i4 = iM2 - 8;
                    byte[] bArr2 = d0aVar.a;
                    int i5 = d0aVar.b;
                    String str = pqf.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    d0aVar.N(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM3 == 1937011815) {
                        s1g s1gVar = new s1g();
                        t1g.e(str2, s1gVar);
                        s03VarA = s1gVar.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = t1g.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (s03VarA != null) {
                    s03VarA.a = charSequenceF;
                    s03VarA.b = null;
                    t03VarA = s03VarA.a();
                } else {
                    Pattern pattern = t1g.a;
                    s1g s1gVar2 = new s1g();
                    s1gVar2.c = charSequenceF;
                    t03VarA = s1gVar2.a().a();
                }
                arrayList.add(t03VarA);
            } else {
                d0aVar.N(iM - 8);
            }
        }
        xl2Var.accept(new w03(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.is7
    public is7 t(j22 j22Var, t99 t99Var) {
        return null;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 21:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (((Boolean) this.b) != null) {
                    str = "value=" + ((Boolean) this.b);
                } else {
                    str = "value not initialized yet";
                }
                return ub3.l(sb, str, ')');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.avf
    public View u(int i) {
        return ((tkb) this.b).t(i);
    }

    @Override // defpackage.avf
    public int v(View view) {
        return view.getRight() + ((ukb) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((ukb) view.getLayoutParams())).rightMargin;
    }

    public t6 w(int i) {
        return null;
    }

    @Override // defpackage.na1
    public Object x(la1 la1Var) {
        t36 t36Var = (t36) this.b;
        ok8.o("The result can only set once!", t36Var.b == null);
        t36Var.b = la1Var;
        return "FutureChain[" + t36Var + "]";
    }

    public void y(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public void z(float f) {
        ((Parcel) this.b).writeFloat(f);
    }

    @Override // defpackage.is7
    public void d() {
    }

    @Override // defpackage.is7
    public void m(t99 t99Var, m22 m22Var) {
    }

    @Override // defpackage.is7
    public void p(t99 t99Var, j22 j22Var, t99 t99Var2) {
    }

    public /* synthetic */ kd9(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ kd9(kb6 kb6Var) {
        this.a = 24;
        this.b = (mtg) kb6Var.b;
    }

    public kd9(mib mibVar, a90 a90Var) {
        this.a = 19;
        this.b = mibVar;
    }

    public kd9(m72 m72Var) {
        this.a = 6;
        Charset charset = r87.a;
        this.b = m72Var;
        m72Var.a = this;
    }

    public void e(int i, t6 t6Var, String str, Bundle bundle) {
    }

    public /* synthetic */ kd9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
