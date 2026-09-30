package defpackage;

import ai.askquin.datastore.model.LocalStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gd8 {
    public final od3 a;
    public final l26 b;
    public final f99 c;
    public final wc8 d;

    public gd8(od3 od3Var) {
        mb8 mb8Var = new mb8(2, null);
        this.a = od3Var;
        this.b = mb8Var;
        this.c = new f99();
        this.d = new wc8(od3Var.d, this);
    }

    public static Object k(gd8 gd8Var, ma8 ma8Var, gbe gbeVar, int i) {
        if ((i & 1) != 0) {
            th5 th5Var = cye.b;
            ma8Var = gcc.E(z57.a.a(), fbc.d()).a();
        }
        th5 th5Var2 = cye.b;
        return gd8Var.j(ma8Var, gcc.E(z57.a.a(), fbc.d()).a(), gbeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ma8 ma8Var, zn2 zn2Var) {
        nb8 nb8Var;
        if (zn2Var instanceof nb8) {
            nb8Var = (nb8) zn2Var;
            int i = nb8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nb8Var.label = i - Integer.MIN_VALUE;
            } else {
                nb8Var = new nb8(this, zn2Var);
            }
        } else {
            nb8Var = new nb8(this, zn2Var);
        }
        Object obj = nb8Var.result;
        int i2 = nb8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ob8 ob8Var = new ob8(ma8Var, null);
            nb8Var.L$0 = null;
            nb8Var.label = 1;
            Object objA = this.a.a(ob8Var, nb8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(LinkedHashMap linkedHashMap, zn2 zn2Var) {
        pb8 pb8Var;
        if (zn2Var instanceof pb8) {
            pb8Var = (pb8) zn2Var;
            int i = pb8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pb8Var.label = i - Integer.MIN_VALUE;
            } else {
                pb8Var = new pb8(this, zn2Var);
            }
        } else {
            pb8Var = new pb8(this, zn2Var);
        }
        Object obj = pb8Var.result;
        int i2 = pb8Var.label;
        wef wefVar = wef.a;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        if (!linkedHashMap.isEmpty()) {
            qb8 qb8Var = new qb8(linkedHashMap, null);
            pb8Var.L$0 = null;
            pb8Var.label = 1;
            Object objA = this.a.a(qb8Var, pb8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) throws Throwable {
        rb8 rb8Var;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        l26 l26Var;
        if (zn2Var instanceof rb8) {
            rb8Var = (rb8) zn2Var;
            int i = rb8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rb8Var.label = i - Integer.MIN_VALUE;
            } else {
                rb8Var = new rb8(this, zn2Var);
            }
        } else {
            rb8Var = new rb8(this, zn2Var);
        }
        Object obj = rb8Var.result;
        int i2 = rb8Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d99Var = this.c;
                rb8Var.L$0 = d99Var;
                rb8Var.label = 1;
                if (d99Var.b(rb8Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    d99 d99Var3 = (d99) rb8Var.L$0;
                    try {
                        jzb.q(obj);
                        d99Var = d99Var3;
                        l26Var = this.b;
                        rb8Var.L$0 = d99Var;
                        rb8Var.label = 3;
                        if (l26Var.z("", rb8Var) != bw2Var) {
                            d99Var2 = d99Var;
                        }
                        return bw2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        d99Var2 = d99Var3;
                    }
                } else {
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d99Var2 = (d99) rb8Var.L$0;
                    try {
                        jzb.q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                d99Var2.h(null);
                throw th;
            }
            d99 d99Var4 = (d99) rb8Var.L$0;
            jzb.q(obj);
            d99Var = d99Var4;
            d99Var2.h(null);
            return wef.a;
            od3 od3Var = this.a;
            sb8 sb8Var = new sb8(2, null);
            rb8Var.L$0 = d99Var;
            rb8Var.label = 2;
            if (od3Var.a(sb8Var, rb8Var) != bw2Var) {
                l26Var = this.b;
                rb8Var.L$0 = d99Var;
                rb8Var.label = 3;
                if (l26Var.z("", rb8Var) != bw2Var) {
                    d99Var2 = d99Var;
                    d99Var2.h(null);
                    return wef.a;
                }
            }
            return bw2Var;
        } catch (Throwable th4) {
            d99 d99Var5 = d99Var;
            th = th4;
            d99Var2 = d99Var5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(zn2 zn2Var) {
        tb8 tb8Var;
        if (zn2Var instanceof tb8) {
            tb8Var = (tb8) zn2Var;
            int i = tb8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tb8Var.label = i - Integer.MIN_VALUE;
            } else {
                tb8Var = new tb8(this, zn2Var);
            }
        } else {
            tb8Var = new tb8(this, zn2Var);
        }
        Object obj = tb8Var.result;
        int i2 = tb8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ub8 ub8Var = new ub8(2, null);
            tb8Var.label = 1;
            Object objA = this.a.a(ub8Var, tb8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [ma8] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v0, types: [gd8] */
    /* JADX WARN: Type inference failed for: r8v14, types: [d99] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [d99] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [d99] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, ma8] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    public final Object e(ma8 ma8Var, zn2 zn2Var) throws Throwable {
        vb8 vb8Var;
        Throwable th;
        ?? r8;
        ?? r1;
        d99 d99Var;
        if (zn2Var instanceof vb8) {
            vb8Var = (vb8) zn2Var;
            int i = vb8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vb8Var.label = i - Integer.MIN_VALUE;
            } else {
                vb8Var = new vb8(this, zn2Var);
            }
        } else {
            vb8Var = new vb8(this, zn2Var);
        }
        Object objA = vb8Var.result;
        int i2 = vb8Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                vb8Var.L$0 = ma8Var;
                f99 f99Var = this.c;
                vb8Var.L$1 = f99Var;
                vb8Var.label = 1;
                if (f99Var.b(vb8Var) != bw2Var) {
                    r1 = ma8Var;
                    d99Var = f99Var;
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r8 = (d99) vb8Var.L$1;
                    try {
                        jzb.q(objA);
                        r8 = r8;
                        wef wefVar = wef.a;
                        r8.h(null);
                        return wefVar;
                    } catch (Throwable th2) {
                        th = th2;
                        r8.h(null);
                        throw th;
                    }
                }
                d99 d99Var2 = (d99) vb8Var.L$1;
                jzb.q(objA);
                ma8Var = d99Var2;
                vb8Var.L$0 = null;
                vb8Var.L$1 = ma8Var;
                vb8Var.L$2 = null;
                vb8Var.L$3 = null;
                vb8Var.label = 3;
                if (s((LocalStorage) objA, vb8Var) != bw2Var) {
                    r8 = ma8Var;
                    wef wefVar2 = wef.a;
                    r8.h(null);
                    return wefVar2;
                }
                return bw2Var;
            }
            d99 d99Var3 = (d99) vb8Var.L$1;
            ma8 ma8Var2 = (ma8) vb8Var.L$0;
            jzb.q(objA);
            r1 = ma8Var2;
            d99Var = d99Var3;
            String string = r1.toString();
            od3 od3Var = this.a;
            wb8 wb8Var = new wb8(string, null);
            vb8Var.L$0 = null;
            vb8Var.L$1 = d99Var;
            vb8Var.L$2 = null;
            vb8Var.label = 2;
            objA = od3Var.a(wb8Var, vb8Var);
            ma8Var = d99Var;
            if (objA != bw2Var) {
                vb8Var.L$0 = null;
                vb8Var.L$1 = ma8Var;
                vb8Var.L$2 = null;
                vb8Var.L$3 = null;
                vb8Var.label = 3;
                if (s((LocalStorage) objA, vb8Var) != bw2Var) {
                    r8 = ma8Var;
                    wef wefVar3 = wef.a;
                    r8.h(null);
                    return wefVar3;
                }
            }
            return bw2Var;
        } catch (Throwable th3) {
            ?? r7 = ma8Var;
            th = th3;
            r8 = r7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, zn2 zn2Var) {
        xb8 xb8Var;
        if (zn2Var instanceof xb8) {
            xb8Var = (xb8) zn2Var;
            int i = xb8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xb8Var.label = i - Integer.MIN_VALUE;
            } else {
                xb8Var = new xb8(this, zn2Var);
            }
        } else {
            xb8Var = new xb8(this, zn2Var);
        }
        Object obj = xb8Var.result;
        int i2 = xb8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            yb8 yb8Var = new yb8(str, null);
            xb8Var.L$0 = null;
            xb8Var.label = 1;
            Object objA = this.a.a(yb8Var, xb8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(zn2 zn2Var) {
        zb8 zb8Var;
        if (zn2Var instanceof zb8) {
            zb8Var = (zb8) zn2Var;
            int i = zb8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zb8Var.label = i - Integer.MIN_VALUE;
            } else {
                zb8Var = new zb8(this, zn2Var);
            }
        } else {
            zb8Var = new zb8(this, zn2Var);
        }
        Object obj = zb8Var.result;
        int i2 = zb8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ac8 ac8Var = new ac8(2, null);
            zb8Var.label = 1;
            Object objA = this.a.a(ac8Var, zb8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(zn2 zn2Var) {
        bc8 bc8Var;
        if (zn2Var instanceof bc8) {
            bc8Var = (bc8) zn2Var;
            int i = bc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bc8Var.label = i - Integer.MIN_VALUE;
            } else {
                bc8Var = new bc8(this, zn2Var);
            }
        } else {
            bc8Var = new bc8(this, zn2Var);
        }
        Object obj = bc8Var.result;
        int i2 = bc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            cc8 cc8Var = new cc8(2, null);
            bc8Var.label = 1;
            Object objA = this.a.a(cc8Var, bc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r9v0, types: [gd8] */
    /* JADX WARN: Type inference failed for: r9v11, types: [d99] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [d99] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [d99] */
    public final Object i(ArrayList arrayList, zn2 zn2Var) throws Throwable {
        dc8 dc8Var;
        Throwable th;
        ?? r9;
        ?? r1;
        d99 d99Var;
        ?? r10;
        if (zn2Var instanceof dc8) {
            dc8Var = (dc8) zn2Var;
            int i = dc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dc8Var.label = i - Integer.MIN_VALUE;
            } else {
                dc8Var = new dc8(this, zn2Var);
            }
        } else {
            dc8Var = new dc8(this, zn2Var);
        }
        Object objA = dc8Var.result;
        int i2 = dc8Var.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                if (arrayList.isEmpty()) {
                    return wefVar;
                }
                dc8Var.L$0 = arrayList;
                f99 f99Var = this.c;
                dc8Var.L$1 = f99Var;
                dc8Var.label = 1;
                if (f99Var.b(dc8Var) != bw2Var) {
                    r1 = arrayList;
                    d99Var = f99Var;
                }
                return bw2Var;
            }
            if (i2 == 1) {
                d99 d99Var2 = (d99) dc8Var.L$1;
                Collection collection = (Collection) dc8Var.L$0;
                jzb.q(objA);
                r1 = collection;
                d99Var = d99Var2;
            } else {
                if (i2 == 2) {
                    d99 d99Var3 = (d99) dc8Var.L$1;
                    jzb.q(objA);
                    arrayList = d99Var3;
                    dc8Var.L$0 = null;
                    dc8Var.L$1 = arrayList;
                    dc8Var.L$2 = null;
                    dc8Var.label = 3;
                    if (s((LocalStorage) objA, dc8Var) != bw2Var) {
                        r10 = arrayList;
                    }
                    return bw2Var;
                }
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r9 = (d99) dc8Var.L$1;
                try {
                    jzb.q(objA);
                    r10 = r9;
                } catch (Throwable th2) {
                    th = th2;
                    r9.h(null);
                    throw th;
                }
            }
            r10.h(null);
            return wefVar;
            od3 od3Var = this.a;
            ec8 ec8Var = new ec8(r1, null);
            dc8Var.L$0 = null;
            dc8Var.L$1 = d99Var;
            dc8Var.label = 2;
            objA = od3Var.a(ec8Var, dc8Var);
            arrayList = d99Var;
            if (objA != bw2Var) {
                dc8Var.L$0 = null;
                dc8Var.L$1 = arrayList;
                dc8Var.L$2 = null;
                dc8Var.label = 3;
                if (s((LocalStorage) objA, dc8Var) != bw2Var) {
                    r10 = arrayList;
                    r10.h(null);
                    return wefVar;
                }
            }
            return bw2Var;
        } catch (Throwable th3) {
            ?? r8 = arrayList;
            th = th3;
            r9 = r8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [ma8] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v0, types: [gd8] */
    /* JADX WARN: Type inference failed for: r8v16, types: [d99] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [d99] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [d99] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, ma8] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    public final Object j(ma8 ma8Var, ma8 ma8Var2, zn2 zn2Var) throws Throwable {
        fc8 fc8Var;
        Throwable th;
        ?? r8;
        ?? r1;
        d99 d99Var;
        if (zn2Var instanceof fc8) {
            fc8Var = (fc8) zn2Var;
            int i = fc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fc8Var.label = i - Integer.MIN_VALUE;
            } else {
                fc8Var = new fc8(this, zn2Var);
            }
        } else {
            fc8Var = new fc8(this, zn2Var);
        }
        Object objA = fc8Var.result;
        int i2 = fc8Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                fc8Var.L$0 = ma8Var;
                fc8Var.L$1 = ma8Var2;
                f99 f99Var = this.c;
                fc8Var.L$2 = f99Var;
                fc8Var.label = 1;
                if (f99Var.b(fc8Var) != bw2Var) {
                    r1 = ma8Var;
                    d99Var = f99Var;
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r8 = (d99) fc8Var.L$2;
                    try {
                        jzb.q(objA);
                        r8 = r8;
                        wef wefVar = wef.a;
                        r8.h(null);
                        return wefVar;
                    } catch (Throwable th2) {
                        th = th2;
                        r8.h(null);
                        throw th;
                    }
                }
                d99 d99Var2 = (d99) fc8Var.L$2;
                jzb.q(objA);
                ma8Var = d99Var2;
                fc8Var.L$0 = null;
                fc8Var.L$1 = null;
                fc8Var.L$2 = ma8Var;
                fc8Var.L$3 = null;
                fc8Var.L$4 = null;
                fc8Var.L$5 = null;
                fc8Var.label = 3;
                if (s((LocalStorage) objA, fc8Var) != bw2Var) {
                    r8 = ma8Var;
                    wef wefVar2 = wef.a;
                    r8.h(null);
                    return wefVar2;
                }
                return bw2Var;
            }
            d99 d99Var3 = (d99) fc8Var.L$2;
            ma8Var2 = (ma8) fc8Var.L$1;
            ma8 ma8Var3 = (ma8) fc8Var.L$0;
            jzb.q(objA);
            r1 = ma8Var3;
            d99Var = d99Var3;
            String string = ma8Var2.toString();
            String string2 = r1.toString();
            od3 od3Var = this.a;
            gc8 gc8Var = new gc8(string2, string, null);
            fc8Var.L$0 = null;
            fc8Var.L$1 = null;
            fc8Var.L$2 = d99Var;
            fc8Var.L$3 = null;
            fc8Var.L$4 = null;
            fc8Var.label = 2;
            objA = od3Var.a(gc8Var, fc8Var);
            ma8Var = d99Var;
            if (objA != bw2Var) {
                fc8Var.L$0 = null;
                fc8Var.L$1 = null;
                fc8Var.L$2 = ma8Var;
                fc8Var.L$3 = null;
                fc8Var.L$4 = null;
                fc8Var.L$5 = null;
                fc8Var.label = 3;
                if (s((LocalStorage) objA, fc8Var) != bw2Var) {
                    r8 = ma8Var;
                    wef wefVar3 = wef.a;
                    r8.h(null);
                    return wefVar3;
                }
            }
            return bw2Var;
        } catch (Throwable th3) {
            ?? r7 = ma8Var;
            th = th3;
            r8 = r7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(zn2 zn2Var) {
        hc8 hc8Var;
        if (zn2Var instanceof hc8) {
            hc8Var = (hc8) zn2Var;
            int i = hc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hc8Var.label = i - Integer.MIN_VALUE;
            } else {
                hc8Var = new hc8(this, zn2Var);
            }
        } else {
            hc8Var = new hc8(this, zn2Var);
        }
        Object obj = hc8Var.result;
        int i2 = hc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            th5 th5Var = cye.b;
            ic8 ic8Var = new ic8(gcc.E(z57.a.a(), fbc.d()).a().toString(), null);
            hc8Var.L$0 = null;
            hc8Var.label = 1;
            Object objA = this.a.a(ic8Var, hc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, zn2 zn2Var) {
        jc8 jc8Var;
        if (zn2Var instanceof jc8) {
            jc8Var = (jc8) zn2Var;
            int i = jc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jc8Var.label = i - Integer.MIN_VALUE;
            } else {
                jc8Var = new jc8(this, zn2Var);
            }
        } else {
            jc8Var = new jc8(this, zn2Var);
        }
        Object obj = jc8Var.result;
        int i2 = jc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            kc8 kc8Var = new kc8(str, null);
            jc8Var.L$0 = null;
            jc8Var.label = 1;
            Object objA = this.a.a(kc8Var, jc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, zn2 zn2Var) {
        lc8 lc8Var;
        if (zn2Var instanceof lc8) {
            lc8Var = (lc8) zn2Var;
            int i = lc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lc8Var.label = i - Integer.MIN_VALUE;
            } else {
                lc8Var = new lc8(this, zn2Var);
            }
        } else {
            lc8Var = new lc8(this, zn2Var);
        }
        Object obj = lc8Var.result;
        int i2 = lc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            mc8 mc8Var = new mc8(str, null);
            lc8Var.L$0 = null;
            lc8Var.label = 1;
            Object objA = this.a.a(mc8Var, lc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, String str2, zn2 zn2Var) {
        nc8 nc8Var;
        if (zn2Var instanceof nc8) {
            nc8Var = (nc8) zn2Var;
            int i = nc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nc8Var.label = i - Integer.MIN_VALUE;
            } else {
                nc8Var = new nc8(this, zn2Var);
            }
        } else {
            nc8Var = new nc8(this, zn2Var);
        }
        Object obj = nc8Var.result;
        int i2 = nc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            oc8 oc8Var = new oc8(str, str2, null);
            nc8Var.L$0 = null;
            nc8Var.L$1 = null;
            nc8Var.label = 1;
            Object objA = this.a.a(oc8Var, nc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(String str, zn2 zn2Var) {
        pc8 pc8Var;
        if (zn2Var instanceof pc8) {
            pc8Var = (pc8) zn2Var;
            int i = pc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pc8Var.label = i - Integer.MIN_VALUE;
            } else {
                pc8Var = new pc8(this, zn2Var);
            }
        } else {
            pc8Var = new pc8(this, zn2Var);
        }
        Object obj = pc8Var.result;
        int i2 = pc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            qc8 qc8Var = new qc8(str, null);
            pc8Var.L$0 = null;
            pc8Var.label = 1;
            Object objA = this.a.a(qc8Var, pc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(va8 va8Var, zn2 zn2Var) {
        rc8 rc8Var;
        if (zn2Var instanceof rc8) {
            rc8Var = (rc8) zn2Var;
            int i = rc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rc8Var.label = i - Integer.MIN_VALUE;
            } else {
                rc8Var = new rc8(this, zn2Var);
            }
        } else {
            rc8Var = new rc8(this, zn2Var);
        }
        Object obj = rc8Var.result;
        int i2 = rc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            sc8 sc8Var = new sc8(va8Var, null);
            rc8Var.L$0 = null;
            rc8Var.label = 1;
            Object objA = this.a.a(sc8Var, rc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(zn2 zn2Var) throws Throwable {
        xc8 xc8Var;
        d99 d99Var;
        Object objB;
        Throwable th;
        d99 d99Var2;
        if (zn2Var instanceof xc8) {
            xc8Var = (xc8) zn2Var;
            int i = xc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xc8Var.label = i - Integer.MIN_VALUE;
            } else {
                xc8Var = new xc8(this, zn2Var);
            }
        } else {
            xc8Var = new xc8(this, zn2Var);
        }
        Object obj = xc8Var.result;
        int i2 = xc8Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d99Var = this.c;
                xc8Var.L$0 = d99Var;
                xc8Var.label = 1;
                if (d99Var.b(xc8Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    this = (gd8) xc8Var.L$1;
                    d99 d99Var3 = (d99) xc8Var.L$0;
                    try {
                        jzb.q(obj);
                        objB = obj;
                        d99Var = d99Var3;
                        xc8Var.L$0 = d99Var;
                        xc8Var.L$1 = null;
                        xc8Var.label = 3;
                        if (this.s((LocalStorage) objB, xc8Var) != bw2Var) {
                            d99Var2 = d99Var;
                        }
                        return bw2Var;
                    } catch (Throwable th2) {
                        th = th2;
                        d99Var2 = d99Var3;
                    }
                } else {
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d99Var2 = (d99) xc8Var.L$0;
                    try {
                        jzb.q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                d99Var2.h(null);
                throw th;
            }
            d99 d99Var4 = (d99) xc8Var.L$0;
            jzb.q(obj);
            d99Var = d99Var4;
            d99Var2.h(null);
            return wef.a;
            ybc ybcVar = this.a.d;
            xc8Var.L$0 = d99Var;
            xc8Var.L$1 = this;
            xc8Var.label = 2;
            objB = tm7.B(ybcVar, xc8Var);
            if (objB != bw2Var) {
                xc8Var.L$0 = d99Var;
                xc8Var.L$1 = null;
                xc8Var.label = 3;
                if (this.s((LocalStorage) objB, xc8Var) != bw2Var) {
                    d99Var2 = d99Var;
                    d99Var2.h(null);
                    return wef.a;
                }
            }
            return bw2Var;
        } catch (Throwable th4) {
            d99 d99Var5 = d99Var;
            th = th4;
            d99Var2 = d99Var5;
        }
    }

    public final Object s(LocalStorage localStorage, zn2 zn2Var) {
        Object objZ = this.b.z(s72.D0(s72.d1(90, s72.a1(s72.j1(s72.n1(s72.Q0(localStorage.getDailyFortuneCompletedDates(), t72.J(localStorage.getLastDailyFortuneCompletedDate())))))), ",", null, null, null, 62), zn2Var);
        return objZ == bw2.a ? objZ : wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(ma8 ma8Var, zn2 zn2Var) {
        yc8 yc8Var;
        if (zn2Var instanceof yc8) {
            yc8Var = (yc8) zn2Var;
            int i = yc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yc8Var.label = i - Integer.MIN_VALUE;
            } else {
                yc8Var = new yc8(this, zn2Var);
            }
        } else {
            yc8Var = new yc8(this, zn2Var);
        }
        Object obj = yc8Var.result;
        int i2 = yc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            zc8 zc8Var = new zc8(ma8Var, null);
            yc8Var.L$0 = null;
            yc8Var.label = 1;
            Object objA = this.a.a(zc8Var, yc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(boolean z, zn2 zn2Var) {
        ad8 ad8Var;
        if (zn2Var instanceof ad8) {
            ad8Var = (ad8) zn2Var;
            int i = ad8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ad8Var.label = i - Integer.MIN_VALUE;
            } else {
                ad8Var = new ad8(this, zn2Var);
            }
        } else {
            ad8Var = new ad8(this, zn2Var);
        }
        Object obj = ad8Var.result;
        int i2 = ad8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            bd8 bd8Var = new bd8(z, null);
            ad8Var.Z$0 = z;
            ad8Var.label = 1;
            Object objA = this.a.a(bd8Var, ad8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(String str, zn2 zn2Var) {
        cd8 cd8Var;
        if (zn2Var instanceof cd8) {
            cd8Var = (cd8) zn2Var;
            int i = cd8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cd8Var.label = i - Integer.MIN_VALUE;
            } else {
                cd8Var = new cd8(this, zn2Var);
            }
        } else {
            cd8Var = new cd8(this, zn2Var);
        }
        Object obj = cd8Var.result;
        int i2 = cd8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            dd8 dd8Var = new dd8(str, null);
            cd8Var.L$0 = null;
            cd8Var.label = 1;
            Object objA = this.a.a(dd8Var, cd8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(boolean z, zn2 zn2Var) {
        ed8 ed8Var;
        if (zn2Var instanceof ed8) {
            ed8Var = (ed8) zn2Var;
            int i = ed8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ed8Var.label = i - Integer.MIN_VALUE;
            } else {
                ed8Var = new ed8(this, zn2Var);
            }
        } else {
            ed8Var = new ed8(this, zn2Var);
        }
        Object obj = ed8Var.result;
        int i2 = ed8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            fd8 fd8Var = new fd8(z, null);
            ed8Var.Z$0 = z;
            ed8Var.label = 1;
            Object objA = this.a.a(fd8Var, ed8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
