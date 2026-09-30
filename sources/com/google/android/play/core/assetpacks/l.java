package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import defpackage.bhg;
import defpackage.h72;
import defpackage.hgg;
import defpackage.igg;
import defpackage.jgg;
import defpackage.kgg;
import defpackage.rch;
import defpackage.rfc;
import defpackage.rgg;
import defpackage.sgg;
import defpackage.vfg;
import defpackage.ygg;
import defpackage.zgg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static final rch d = new rch("ExtractorTaskFinder");
    public final k a;
    public final b b;
    public final d c;

    public l(k kVar, b bVar, d dVar) {
        this.a = kVar;
        this.b = bVar;
        this.c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03c7 A[PHI: r17
  0x03c7: PHI (r17v2 h72) = (r17v1 h72), (r17v4 h72) binds: [B:49:0x0181, B:64:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x03ca A[PHI: r10
  0x03ca: PHI (r10v2 h72) = (r10v1 h72), (r10v4 h72) binds: [B:24:0x009c, B:36:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    public final h72 a() {
        rch rchVar;
        h72 sggVar;
        h72 h72Var;
        h72 bhgVar;
        d dVar;
        ArrayList arrayList;
        vfg vfgVar;
        ygg yggVar;
        int iA;
        b bVar = this.b;
        k kVar = this.a;
        try {
            kVar.d.lock();
            ArrayList arrayList2 = new ArrayList();
            for (jgg jggVar : kVar.c.values()) {
                if (rfc.f(jggVar.c.d)) {
                    arrayList2.add(jggVar);
                }
            }
            if (arrayList2.isEmpty()) {
                h72Var = null;
            } else {
                HashMap mapL = bVar.l();
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    rchVar = d;
                    if (!zHasNext) {
                        sggVar = null;
                        break;
                    }
                    jgg jggVar2 = (jgg) it.next();
                    igg iggVar = jggVar2.c;
                    Long l = (Long) mapL.get(iggVar.a);
                    if (l != null && iggVar.b == l.longValue()) {
                        rchVar.a("Found promote pack task for session %s with pack %s.", Integer.valueOf(jggVar2.a), iggVar.a);
                        int i = jggVar2.a;
                        String str = iggVar.a;
                        sggVar = new zgg(i, (int) b.b(new File(bVar.d(), str)), jggVar2.b, iggVar.b, str);
                        break;
                    }
                }
                if (sggVar == null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            sggVar = null;
                            break;
                        }
                        jgg jggVar3 = (jgg) it2.next();
                        try {
                            igg iggVar2 = jggVar3.c;
                            if (bVar.g(jggVar3.b, iggVar2.b, iggVar2.a) == iggVar2.f.size()) {
                                rchVar.a("Found final move task for session %s with pack %s.", Integer.valueOf(jggVar3.a), iggVar2.a);
                                sggVar = new sgg(jggVar3.a, jggVar3.b, iggVar2.b, iggVar2.a, iggVar2.c);
                                break;
                            }
                        } catch (IOException e) {
                            throw new g("Failed to check number of completed merges for session " + jggVar3.a + ", pack " + jggVar3.c.a, e, jggVar3.a);
                        }
                    }
                    if (sggVar == null) {
                        Iterator it3 = arrayList2.iterator();
                        loop3: while (true) {
                            if (!it3.hasNext()) {
                                bhgVar = null;
                                break;
                            }
                            jgg jggVar4 = (jgg) it3.next();
                            igg iggVar3 = jggVar4.c;
                            if (rfc.f(iggVar3.d)) {
                                for (kgg kggVar : iggVar3.f) {
                                    if (this.b.j(jggVar4.b, iggVar3.b, iggVar3.a, kggVar.a).exists()) {
                                        rchVar.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(jggVar4.a), iggVar3.a, kggVar.a);
                                        bhgVar = new rgg(jggVar4.a, jggVar4.b, iggVar3.b, iggVar3.a, kggVar.a);
                                        break loop3;
                                    }
                                }
                            }
                        }
                        if (bhgVar == null) {
                            Iterator it4 = arrayList2.iterator();
                            loop5: while (true) {
                                if (!it4.hasNext()) {
                                    bhgVar = null;
                                    break;
                                }
                                jgg jggVar5 = (jgg) it4.next();
                                igg iggVar4 = jggVar5.c;
                                if (rfc.f(iggVar4.d)) {
                                    for (kgg kggVar2 : iggVar4.f) {
                                        if (b(jggVar5, kggVar2)) {
                                            if (this.b.i(jggVar5.b, iggVar4.b, iggVar4.a, kggVar2.a).exists()) {
                                                rchVar.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(jggVar5.a), iggVar4.a, kggVar2.a);
                                                bhgVar = new bhg(jggVar5.a, iggVar4.a, jggVar5.b, iggVar4.b, kggVar2.a, kggVar2.b);
                                                break loop5;
                                            }
                                        }
                                    }
                                }
                            }
                            if (bhgVar == null) {
                                Iterator it5 = arrayList2.iterator();
                                loop7: while (true) {
                                    boolean zHasNext2 = it5.hasNext();
                                    int i2 = 2;
                                    int i3 = 1;
                                    dVar = this.c;
                                    if (!zHasNext2) {
                                        arrayList = arrayList2;
                                        vfgVar = null;
                                        break;
                                    }
                                    jgg jggVar6 = (jgg) it5.next();
                                    igg iggVar5 = jggVar6.c;
                                    if (rfc.f(iggVar5.d)) {
                                        for (kgg kggVar3 : iggVar5.f) {
                                            int i4 = kggVar3.f;
                                            int i5 = (i4 == i3 || i4 == i2) ? i3 : 0;
                                            String str2 = kggVar3.a;
                                            ArrayList arrayList3 = kggVar3.d;
                                            if (i5 == 0) {
                                                b bVar2 = this.b;
                                                igg iggVar6 = jggVar6.c;
                                                arrayList = arrayList2;
                                                Iterator it6 = it5;
                                                try {
                                                    iA = new q(bVar2, iggVar6.a, jggVar6.b, iggVar6.b, kggVar3.a).a();
                                                } catch (IOException e2) {
                                                    rchVar.b("Slice checkpoint corrupt, restarting extraction. %s", e2);
                                                    iA = 0;
                                                }
                                                if (iA != -1 && ((hgg) arrayList3.get(iA)).a) {
                                                    rchVar.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(kggVar3.e), Integer.valueOf(jggVar6.a), jggVar6.c.a, str2, Integer.valueOf(iA));
                                                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStreamA = dVar.a(jggVar6.c.a, jggVar6.a, str2, iA);
                                                    int i6 = jggVar6.a;
                                                    igg iggVar7 = jggVar6.c;
                                                    String str3 = iggVar7.a;
                                                    int i7 = jggVar6.b;
                                                    long j = iggVar7.b;
                                                    String str4 = iggVar7.c;
                                                    String str5 = kggVar3.a;
                                                    int i8 = kggVar3.e;
                                                    int size = arrayList3.size();
                                                    igg iggVar8 = jggVar6.c;
                                                    vfgVar = new vfg(i6, str3, i7, j, str4, str5, i8, iA, size, iggVar8.e, iggVar8.d, autoCloseInputStreamA);
                                                    break loop7;
                                                }
                                                arrayList2 = arrayList;
                                                it5 = it6;
                                                i2 = 2;
                                                i3 = 1;
                                            }
                                        }
                                    }
                                }
                                if (vfgVar == null) {
                                    Iterator it7 = arrayList.iterator();
                                    loop9: while (true) {
                                        if (!it7.hasNext()) {
                                            yggVar = null;
                                            break;
                                        }
                                        jgg jggVar7 = (jgg) it7.next();
                                        igg iggVar9 = jggVar7.c;
                                        if (rfc.f(iggVar9.d)) {
                                            for (kgg kggVar4 : iggVar9.f) {
                                                int i9 = kggVar4.f;
                                                boolean z = i9 == 1 || i9 == 2;
                                                String str6 = kggVar4.a;
                                                if (z && ((hgg) kggVar4.d.get(0)).a && !b(jggVar7, kggVar4)) {
                                                    rchVar.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(kggVar4.f), Integer.valueOf(jggVar7.a), jggVar7.c.a, str6);
                                                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStreamA2 = dVar.a(jggVar7.c.a, jggVar7.a, str6, 0);
                                                    int i10 = jggVar7.a;
                                                    String str7 = jggVar7.c.a;
                                                    int iB = (int) b.b(new File(bVar.d(), str7));
                                                    String str8 = jggVar7.c.a;
                                                    yggVar = new ygg(i10, str7, iB, b.b(new File(new File(bVar.d(), str8), String.valueOf((int) b.b(new File(bVar.d(), str8))))), jggVar7.b, jggVar7.c.b, kggVar4.f, kggVar4.a, kggVar4.c, autoCloseInputStreamA2);
                                                    break loop9;
                                                }
                                            }
                                        }
                                    }
                                    if (yggVar != null) {
                                        kVar.d.unlock();
                                        return yggVar;
                                    }
                                    h72Var = null;
                                } else {
                                    h72Var = vfgVar;
                                }
                            } else {
                                h72Var = bhgVar;
                            }
                        } else {
                            h72Var = bhgVar;
                        }
                    } else {
                        h72Var = sggVar;
                    }
                } else {
                    h72Var = sggVar;
                }
            }
            kVar.d.unlock();
            return h72Var;
        } catch (Throwable th) {
            kVar.d.unlock();
            throw th;
        }
    }

    public final boolean b(jgg jggVar, kgg kggVar) {
        igg iggVar = jggVar.c;
        String str = iggVar.a;
        long j = iggVar.b;
        int i = jggVar.b;
        String str2 = kggVar.a;
        rch rchVar = q.h;
        b bVar = this.b;
        bVar.getClass();
        File file = new File(new File(new File(new File(bVar.c(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    fileInputStream.close();
                    if (properties.getProperty("fileStatus") == null) {
                        rchVar.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                        return false;
                    }
                    if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                        return true;
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                rchVar.b("Could not read checkpoint while checking if extraction finished. %s", e);
                return false;
            }
        }
        return false;
    }
}
