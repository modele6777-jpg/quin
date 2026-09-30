package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.view.View;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class gdc {
    public static final void a(Object obj, String str, j09 j09Var, bn2 bn2Var, c82 c82Var, l46 l46Var, int i, int i2) {
        if ((i2 & 64) != 0) {
            bn2Var = an2.b;
        }
        int i3 = i << 3;
        bzd.b(obj, str, skd.a((Context) l46Var.k(uq.b)), j09Var, bn2Var, (i2 & 256) != 0 ? null : c82Var, l46Var, (i & 126) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), (i >> 27) & 14, 0);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = e1a.b;
        e1a e1aVarR = y25.r("/");
        LinkedHashMap linkedHashMapI = bm8.I(new iy9(e1aVarR, new rdg(e1aVarR, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (rdg rdgVar : s72.b1(arrayList, new kv8(20))) {
            if (((rdg) linkedHashMapI.put(rdgVar.a, rdgVar)) == null) {
                while (true) {
                    e1a e1aVar = rdgVar.a;
                    e1a e1aVarC = e1aVar.c();
                    if (e1aVarC == null) {
                        break;
                    }
                    rdg rdgVar2 = (rdg) linkedHashMapI.get(e1aVarC);
                    if (rdgVar2 != null) {
                        rdgVar2.q.add(e1aVar);
                        break;
                    }
                    rdg rdgVar3 = new rdg(e1aVarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapI.put(e1aVarC, rdgVar3);
                    rdgVar3.q.add(e1aVar);
                    rdgVar = rdgVar3;
                }
            }
        }
        return linkedHashMapI;
    }

    public static final int c(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final pwf d(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            pwf pwfVar = tag instanceof pwf ? (pwf) tag : null;
            if (pwfVar != null) {
                return pwfVar;
            }
            Object objG = jcc.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return null;
    }

    public static final String e(int i) {
        tq.o(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final Object f(xg9 xg9Var, wn7 wn7Var) {
        xg9Var.getClass();
        wn7Var.getClass();
        return xg9Var.invoke();
    }

    public static final boolean g(ywc ywcVar) {
        twc twcVarK = ywcVar.k();
        return twcVarK.a.c(cxc.B);
    }

    public static final void h(String str) {
        str.getClass();
        throw new IllegalArgumentException(ib8.j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6 A[Catch: all -> 0x014a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    public static final sdg i(e1a e1aVar, zd5 zd5Var, a26 a26Var) {
        yhb yhbVar;
        Throwable th;
        Throwable th2;
        Throwable th3;
        zd5Var.getClass();
        jk7 jk7VarW = zd5Var.W(e1aVar);
        try {
            long size = jk7VarW.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + jk7VarW.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                yhb yhbVar2 = new yhb(jk7VarW.b(j));
                try {
                    if (yhbVar2.G() == 101010256) {
                        int iU = yhbVar2.U() & 65535;
                        int iU2 = yhbVar2.U() & 65535;
                        long jU = yhbVar2.U() & 65535;
                        if (jU != (yhbVar2.U() & 65535) || iU != 0 || iU2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        yhbVar2.k0(4L);
                        long jG = ((long) yhbVar2.G()) & 4294967295L;
                        int iU3 = yhbVar2.U() & 65535;
                        w21 w21Var = new w21(jU, iU3, jG);
                        yhbVar2.W(iU3);
                        yhbVar2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            yhb yhbVar3 = new yhb(jk7VarW.b(j3));
                            try {
                                if (yhbVar3.G() == 117853008) {
                                    int iG = yhbVar3.G();
                                    long jN = yhbVar3.N();
                                    if (yhbVar3.G() != 1 || iG != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    yhb yhbVar4 = new yhb(jk7VarW.b(jN));
                                    try {
                                        int iG2 = yhbVar4.G();
                                        if (iG2 != 101075792) {
                                            throw new IOException("bad zip: expected " + e(101075792) + " but was " + e(iG2));
                                        }
                                        yhbVar4.k0(12L);
                                        int iG3 = yhbVar4.G();
                                        int iG4 = yhbVar4.G();
                                        long jN2 = yhbVar4.N();
                                        if (jN2 != yhbVar4.N() || iG3 != 0 || iG4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        yhbVar4.k0(8L);
                                        w21 w21Var2 = new w21(jN2, iU3, yhbVar4.N());
                                        try {
                                            yhbVar4.close();
                                            th3 = null;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                        }
                                        w21Var = w21Var2;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            yhbVar4.close();
                                        } catch (Throwable th6) {
                                            bzd.m(th5, th6);
                                        }
                                        th3 = th5;
                                    }
                                }
                                try {
                                    yhbVar3.close();
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    yhbVar3.close();
                                } catch (Throwable th9) {
                                    bzd.m(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        yhb yhbVar5 = new yhb(jk7VarW.b(w21Var.c));
                        try {
                            long j4 = w21Var.b;
                            while (j2 < j4) {
                                rdg rdgVarK = k(yhbVar5);
                                yhbVar = yhbVar5;
                                try {
                                    if (rdgVarK.h >= w21Var.c) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) a26Var.d(rdgVarK)).booleanValue()) {
                                        arrayList.add(rdgVarK);
                                    }
                                    j2++;
                                    yhbVar5 = yhbVar;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    try {
                                        yhbVar.close();
                                    } catch (Throwable th11) {
                                        bzd.m(th, th11);
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    sdg sdgVar = new sdg(e1aVar, zd5Var, b(arrayList));
                                    try {
                                        jk7VarW.close();
                                    } catch (Throwable unused) {
                                    }
                                    return sdgVar;
                                }
                            }
                            try {
                                yhbVar5.close();
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            yhbVar = yhbVar5;
                        }
                        if (th == null) {
                            throw th;
                        }
                        sdg sdgVar2 = new sdg(e1aVar, zd5Var, b(arrayList));
                        jk7VarW.close();
                        return sdgVar2;
                    }
                    yhbVar2.close();
                    j--;
                } catch (Throwable th14) {
                    yhbVar2.close();
                    throw th14;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th15) {
            if (jk7VarW == null) {
                throw th15;
            }
            try {
                jk7VarW.close();
                throw th15;
            } catch (Throwable th16) {
                bzd.m(th15, th16);
                throw th15;
            }
        }
    }

    public static long j(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static final rdg k(yhb yhbVar) throws IOException {
        int iG = yhbVar.G();
        if (iG != 33639248) {
            throw new IOException("bad zip: expected " + e(33639248) + " but was " + e(iG));
        }
        yhbVar.k0(4L);
        short sU = yhbVar.U();
        int i = sU & 65535;
        if ((sU & 1) != 0) {
            yg5.m("unsupported zip: general purpose bit flag=".concat(e(i)));
            return null;
        }
        int iU = yhbVar.U() & 65535;
        int iU2 = yhbVar.U() & 65535;
        int iU3 = yhbVar.U() & 65535;
        long jG = ((long) yhbVar.G()) & 4294967295L;
        lmb lmbVar = new lmb();
        lmbVar.element = ((long) yhbVar.G()) & 4294967295L;
        lmb lmbVar2 = new lmb();
        lmbVar2.element = ((long) yhbVar.G()) & 4294967295L;
        int iU4 = yhbVar.U() & 65535;
        int iU5 = yhbVar.U() & 65535;
        int iU6 = yhbVar.U() & 65535;
        yhbVar.k0(8L);
        lmb lmbVar3 = new lmb();
        lmbVar3.element = ((long) yhbVar.G()) & 4294967295L;
        String strW = yhbVar.W(iU4);
        if (v4e.G(strW, (char) 0)) {
            yg5.m("bad zip: filename contains 0x00");
            return null;
        }
        long j = lmbVar2.element == 4294967295L ? 8L : 0L;
        if (lmbVar.element == 4294967295L) {
            j += 8;
        }
        if (lmbVar3.element == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        mmb mmbVar = new mmb();
        mmb mmbVar2 = new mmb();
        mmb mmbVar3 = new mmb();
        imb imbVar = new imb();
        l(yhbVar, iU5, new pe3(imbVar, j2, lmbVar2, yhbVar, lmbVar, lmbVar3, mmbVar, mmbVar2, mmbVar3));
        if (j2 > 0 && !imbVar.element) {
            yg5.m("bad zip: zip64 extra required but absent");
            return null;
        }
        String strW2 = yhbVar.W(iU6);
        String str = e1a.b;
        return new rdg(y25.r("/").e(strW), c5e.u(strW, "/", false), strW2, jG, lmbVar.element, lmbVar2.element, iU, lmbVar3.element, iU3, iU2, (Long) mmbVar.element, (Long) mmbVar2.element, (Long) mmbVar3.element, 57344);
    }

    public static final void l(yhb yhbVar, int i, l26 l26Var) throws IOException {
        f41 f41Var = yhbVar.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                yg5.m("bad zip: truncated header in extra field");
                return;
            }
            int iU = yhbVar.U() & 65535;
            long jU = ((long) yhbVar.U()) & 65535;
            long j2 = j - 4;
            if (j2 < jU) {
                yg5.m("bad zip: truncated value in extra field");
                return;
            }
            yhbVar.h0(jU);
            long j3 = f41Var.b;
            l26Var.z(Integer.valueOf(iU), Long.valueOf(jU));
            long j4 = (f41Var.b + jU) - j3;
            if (j4 < 0) {
                yg5.m(tec.e(iU, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    f41Var.c1(j4);
                }
                j = j2 - jU;
            }
        }
    }

    public static final rdg m(yhb yhbVar, rdg rdgVar) throws IOException {
        int iG = yhbVar.G();
        if (iG != 67324752) {
            throw new IOException("bad zip: expected " + e(67324752) + " but was " + e(iG));
        }
        yhbVar.k0(2L);
        short sU = yhbVar.U();
        int i = sU & 65535;
        if ((sU & 1) != 0) {
            yg5.m("unsupported zip: general purpose bit flag=".concat(e(i)));
            return null;
        }
        yhbVar.k0(18L);
        long jU = ((long) yhbVar.U()) & 65535;
        int iU = yhbVar.U() & 65535;
        yhbVar.k0(jU);
        if (rdgVar == null) {
            yhbVar.k0(iU);
            return null;
        }
        mmb mmbVar = new mmb();
        mmb mmbVar2 = new mmb();
        mmb mmbVar3 = new mmb();
        l(yhbVar, iU, new tdg(yhbVar, mmbVar, mmbVar2, mmbVar3));
        return new rdg(rdgVar.a, rdgVar.b, rdgVar.c, rdgVar.d, rdgVar.e, rdgVar.f, rdgVar.g, rdgVar.h, rdgVar.i, rdgVar.j, rdgVar.k, rdgVar.l, rdgVar.m, (Integer) mmbVar.element, (Integer) mmbVar2.element, (Integer) mmbVar3.element);
    }

    public static final ryb n(ryb rybVar) {
        rybVar.getClass();
        pyb pybVarH = rybVar.h();
        vyb vybVar = rybVar.g;
        pybVarH.g = new qff(vybVar.l(), vybVar.h());
        return pybVarH.a();
    }

    public static final r2h o(w2h w2hVar) throws g2h {
        try {
            u2h u2hVarU = w2hVar.u();
            if (u2hVarU == null) {
                throw new g2h("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = u2hVarU.b;
                byte b2 = u2hVarU.a;
                int i = 0;
                if (b2 == -128) {
                    long jB = w2hVar.b();
                    if (jB > 1000) {
                        throw new g2h("Parser being asked to read a large CBOR array");
                    }
                    p(b, jB);
                    r2h[] r2hVarArr = new r2h[(int) jB];
                    while (i < jB) {
                        r2hVarArr[i] = o(w2hVar);
                        i++;
                    }
                    return new a2h(qtg.p(r2hVarArr));
                }
                try {
                    if (b2 != -96) {
                        if (b2 == -64) {
                            throw new g2h("Tags are currently unsupported");
                        }
                        if (b2 == -32) {
                            return new d2h(w2hVar.x());
                        }
                        if (b2 == 0 || b2 == 32) {
                            long jH = w2hVar.h();
                            p(b, jH > 0 ? jH : ~jH);
                            return new i2h(jH);
                        }
                        if (b2 == 64) {
                            w2hVar.N((byte) 64);
                            byte[] bArrU = w2hVar.U();
                            int length = bArrU.length;
                            p(b, length);
                            return new e2h(d1h.k(bArrU, length));
                        }
                        if (b2 != 96) {
                            throw new g2h("Unidentifiable major type: " + ((b2 >> 5) & 7));
                        }
                        w2hVar.N((byte) 96);
                        String str = new String(w2hVar.U(), StandardCharsets.UTF_8);
                        p(b, str.length());
                        return new m2h(str);
                    }
                    long jL = w2hVar.l();
                    if (jL > 1000) {
                        throw new g2h("Parser being asked to read a large CBOR map");
                    }
                    p(b, jL);
                    int i2 = (int) jL;
                    gsg[] gsgVarArr = new gsg[i2];
                    r2h r2hVar = null;
                    int i3 = 0;
                    while (i3 < jL) {
                        r2h r2hVarO = o(w2hVar);
                        if (r2hVar != null && r2hVarO.compareTo(r2hVar) <= 0) {
                            throw new y1h("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + r2hVar.toString() + "\nCurrent key: " + r2hVarO.toString());
                        }
                        gsgVarArr[i3] = new gsg(r2hVarO, o(w2hVar));
                        i3++;
                        r2hVar = r2hVarO;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i < i2) {
                        gsg gsgVar = gsgVarArr[i];
                        if (treeMap.containsKey((r2h) gsgVar.a)) {
                            throw new y1h("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((r2h) gsgVar.a, (r2h) gsgVar.b);
                        i++;
                    }
                    return new l2h(bug.c(treeMap));
                } catch (RuntimeException e) {
                    e = e;
                    throw new g2h(e);
                }
            } catch (IOException | RuntimeException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            throw new g2h(e3);
        }
    }

    public static final void p(byte b, long j) throws y1h {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new y1h(kv2.m("Integer value ", " after add info could have been represented in 0 additional bytes, but used 1", j));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new y1h(kv2.m("Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2", j));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new y1h(kv2.m("Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4", j));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new y1h(kv2.m("Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8", j));
                }
                return;
            default:
                return;
        }
    }
}
