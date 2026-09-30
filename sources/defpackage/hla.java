package defpackage;

import ai.askquin.ui.share.ShareActivity;
import android.os.Bundle;
import android.os.Trace;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hla implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hla(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[Catch: all -> 0x007d, LOOP:2: B:20:0x0048->B:34:0x0087, LOOP_END, TryCatch #4 {all -> 0x007d, blocks: (B:28:0x0077, B:31:0x007f, B:36:0x0090, B:34:0x0087), top: B:170:0x0077 }] */
    @Override // defpackage.x16
    public final Object invoke() throws Throwable {
        int iT;
        iy9 iy9Var;
        iy9 iy9Var2;
        Object obj;
        int i = this.a;
        int i2 = 2;
        boolean z = true;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(ila.m((ila) obj2));
            case 1:
                File file = (File) ((ek9) obj2).invoke();
                if (!ne5.a0(file).equals("preferences_pb")) {
                    r82.e(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 2:
                ((grf) obj2).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                String string = uuidRandomUUID.toString();
                string.getClass();
                return string;
            case 3:
                return Integer.valueOf(((t5b) ((u5b) obj2)).a.size());
            case 4:
                x1f x1fVar = x1f.a;
                p05 p05Var = p05.a;
                x1f.k(p05Var, new zea(23), 2);
                x1f.k(p05Var, new zea(24), 2);
                ((ro2) obj2).invoke();
                return wef.a;
            case 5:
                ((edb) obj2).b.c.n(null, o0c.c);
                return wef.a;
            case 6:
                return ((phb) obj2).a();
            case 7:
                jkb jkbVar = (jkb) obj2;
                jkbVar.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    jkbVar.a();
                    return wef.a;
                } finally {
                    Trace.endSection();
                }
            case 8:
                yxb yxbVar = (yxb) obj2;
                ClassLoader classLoader = yxbVar.c;
                zd5 zd5Var = yxbVar.d;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (pa7.t(url.getProtocol(), "file")) {
                        String str = e1a.b;
                        iy9Var2 = new iy9(zd5Var, y25.t(new File(url.toURI())));
                    } else {
                        iy9Var2 = null;
                    }
                    if (iy9Var2 != null) {
                        arrayList.add(iy9Var2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String string2 = url2.toString();
                    string2.getClass();
                    if (c5e.C(string2, "jar:file:", false) && (iT = v4e.T(string2, "!", 0, 6)) != -1) {
                        String str2 = e1a.b;
                        iy9Var = new iy9(gdc.i(y25.t(new File(URI.create(string2.substring(4, iT)))), zd5Var, new z8b(21)), yxb.f);
                    } else {
                        iy9Var = null;
                    }
                    if (iy9Var != null) {
                        arrayList2.add(iy9Var);
                    }
                }
                return s72.Q0(arrayList, arrayList2);
            case 9:
                ((imb) obj2).element = true;
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ((Callable) obj2).call();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Runnable) obj2).run();
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                pcc pccVar = (pcc) obj2;
                odc odcVar = pccVar.a;
                Object obj3 = pccVar.d;
                if (obj3 != null) {
                    return odcVar.N(pccVar, obj3);
                }
                qc0.j("Value should be initialized");
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                lqb lqbVar = ((xcc) obj2).c;
                if (lqbVar == null) {
                    return null;
                }
                Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                lqbVar.q(bundleR);
                if (bundleR.isEmpty()) {
                    return null;
                }
                return bundleR;
            case 14:
                return cdc.c((pwf) obj2);
            case 15:
                kdc kdcVar = (kdc) obj2;
                kdcVar.k().a(new gkb(0, kdcVar));
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((ngc) obj2).a(true);
                return wef.a;
            case 17:
                ihc ihcVar = (ihc) obj2;
                ur urVar = (ur) eb3.H(ihcVar, mu9.a);
                ihcVar.P0 = urVar;
                ihcVar.Q0 = urVar != null ? new tr(urVar.a, urVar.b, urVar.c, urVar.d) : null;
                return wef.a;
            case 18:
                return ((lsc) obj2).d.d().c.toString();
            case 19:
                ltc ltcVar = (ltc) obj2;
                n3f n3fVar = ltcVar.e;
                ltcVar.f = n3fVar != null ? ((Number) n3fVar.m.getValue()).longValue() : 0L;
                return wef.a;
            case 20:
                return obj2;
            case 21:
                pyc pycVar = (pyc) obj2;
                return Integer.valueOf(cn1.F(pycVar, pycVar.k));
            case 22:
                return ((eab) ((k4d) obj2).d).b();
            case 23:
                m4d m4dVar = (m4d) obj2;
                vz9 vz9Var = m4dVar.c;
                if (((ald) vz9Var.getValue()).a == 9205357640488583168L || ald.e(((ald) vz9Var.getValue()).a)) {
                    return null;
                }
                return m4dVar.a.c(((ald) vz9Var.getValue()).a);
            case 24:
                int i3 = ShareActivity.T0;
                return db6.A0(((had) ((iad) obj2)).a);
            case 25:
                return ((mo3) ((t7) obj2)).a();
            case 26:
                ((Boolean) ((gpd) obj2).m.getValue()).booleanValue();
                return wef.a;
            case 27:
                ((lqd) ((fqd) obj2)).a();
                return Boolean.TRUE;
            case 28:
                nsd nsdVar = (nsd) obj2;
                while (true) {
                    Object obj4 = nsdVar.g;
                    synchronized (obj4) {
                        try {
                            if (nsdVar.c) {
                                obj = obj4;
                            } else {
                                nsdVar.c = z;
                                try {
                                    p89 p89Var = nsdVar.f;
                                    Object[] objArr = p89Var.a;
                                    int i4 = p89Var.c;
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        msd msdVar = (msd) objArr[i5];
                                        x79 x79Var = msdVar.g;
                                        a26 a26Var = msdVar.a;
                                        Object[] objArr2 = x79Var.b;
                                        long[] jArr = x79Var.a;
                                        int length = jArr.length - i2;
                                        if (length >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j = jArr[i6];
                                                obj = obj4;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j & 255) < 128) {
                                                            try {
                                                                a26Var.d(objArr2[(i6 << 3) + i8]);
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                nsdVar.c = false;
                                                                throw th;
                                                            }
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i7 == 8) {
                                                        if (i6 != length) {
                                                            i6++;
                                                            obj4 = obj;
                                                        }
                                                    }
                                                } else if (i6 != length) {
                                                    i6++;
                                                    obj4 = obj;
                                                }
                                            }
                                        } else {
                                            obj = obj4;
                                        }
                                        x79Var.f();
                                        i5++;
                                        i2 = 2;
                                        obj4 = obj;
                                    }
                                    obj = obj4;
                                    try {
                                        nsdVar.c = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj4;
                                }
                            }
                            if (!nsdVar.c()) {
                                return wef.a;
                            }
                            i2 = 2;
                            z = true;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj4;
                        }
                    }
                }
                break;
            default:
                sz9 sz9Var = ((iwd) obj2).d;
                if (sz9Var.j() > 0) {
                    sz9Var.k(sz9Var.j() - 1);
                }
                return wef.a;
        }
    }
}
