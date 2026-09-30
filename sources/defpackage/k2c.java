package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k2c {
    public final p1c a;
    public final ConcurrentHashMap.KeySetView b = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap.KeySetView c = ConcurrentHashMap.newKeySet();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public k2c(p1c p1cVar) {
        this.a = p1cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Object obj, a26 a26Var, zn2 zn2Var) {
        s1c s1cVar;
        if (zn2Var instanceof s1c) {
            s1cVar = (s1c) zn2Var;
            int i = s1cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                s1cVar.label = i - Integer.MIN_VALUE;
            } else {
                s1cVar = new s1c(this, zn2Var);
            }
        } else {
            s1cVar = new s1c(this, zn2Var);
        }
        Object obj2 = s1cVar.result;
        int i2 = s1cVar.label;
        ConcurrentHashMap.KeySetView keySetView = this.b;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = s1cVar.L$1;
                jzb.q(obj2);
                return obj2;
            }
            jzb.q(obj2);
            if (keySetView.contains(str)) {
                return obj;
            }
            s1cVar.L$0 = str;
            s1cVar.L$1 = obj;
            s1cVar.L$2 = null;
            s1cVar.label = 1;
            Object objD = a26Var.d(s1cVar);
            Object obj4 = bw2.a;
            return objD == obj4 ? obj4 : objD;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            keySetView.getClass();
            keySetView.add(str);
            tec.t(hf8.Q, "ReviewReward", "Review reward storage failed", e2);
            return obj;
        }
    }

    public final d99 b(String str) {
        Object objComputeIfAbsent = this.e.computeIfAbsent(str, new mx2(3, new z8b(24)));
        objComputeIfAbsent.getClass();
        return (d99) objComputeIfAbsent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(xn2 xn2Var, l26 l26Var, String str) throws Throwable {
        w1c w1cVar;
        d99 d99VarB;
        Throwable th;
        d99 d99Var;
        if (xn2Var instanceof w1c) {
            w1cVar = (w1c) xn2Var;
            int i = w1cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1cVar.label = i - Integer.MIN_VALUE;
            } else {
                w1cVar = new w1c(this, xn2Var);
            }
        } else {
            w1cVar = new w1c(this, xn2Var);
        }
        Object obj = w1cVar.result;
        int i2 = w1cVar.label;
        Object obj2 = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                if (v4e.Q(str)) {
                    return null;
                }
                d99VarB = b(str);
                w1cVar.L$0 = str;
                w1cVar.L$1 = l26Var;
                w1cVar.L$2 = d99VarB;
                w1cVar.label = 1;
                if (d99VarB.b(w1cVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var = (d99) w1cVar.L$2;
                try {
                    jzb.q(obj);
                    ReviewRewardState reviewRewardState = (ReviewRewardState) obj;
                    d99Var.h(null);
                    return reviewRewardState;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var.h(null);
                    throw th;
                }
            }
            d99 d99Var2 = (d99) w1cVar.L$2;
            l26 l26Var2 = (l26) w1cVar.L$1;
            String str2 = (String) w1cVar.L$0;
            jzb.q(obj);
            d99VarB = d99Var2;
            l26Var = l26Var2;
            str = str2;
            this.b.remove(str);
            a26 x1cVar = new x1c(null, l26Var, str);
            w1cVar.L$0 = null;
            w1cVar.L$1 = null;
            w1cVar.L$2 = d99VarB;
            w1cVar.label = 2;
            Object objA = a(str, null, x1cVar, w1cVar);
            if (objA != obj2) {
                d99 d99Var3 = d99VarB;
                obj = objA;
                d99Var = d99Var3;
                ReviewRewardState reviewRewardState2 = (ReviewRewardState) obj;
                d99Var.h(null);
                return reviewRewardState2;
            }
            return obj2;
        } catch (Throwable th3) {
            d99 d99Var4 = d99VarB;
            th = th3;
            d99Var = d99Var4;
            d99Var.h(null);
            throw th;
        }
    }

    public final Object d(String str, gbe gbeVar) {
        return v4e.Q(str) ? Boolean.FALSE : f(str, Boolean.FALSE, new b2c(this, str, null), gbeVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009c A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:13:0x0035, B:38:0x0098, B:40:0x009c, B:48:0x00ae, B:49:0x00b1), top: B:55:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, zn2 zn2Var) throws Throwable {
        e2c e2cVar;
        String str3;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        CancellationException e;
        String str4;
        u2c u2cVar;
        if (zn2Var instanceof e2c) {
            e2cVar = (e2c) zn2Var;
            int i = e2cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                e2cVar.label = i - Integer.MIN_VALUE;
            } else {
                e2cVar = new e2c(this, zn2Var);
            }
        } else {
            e2cVar = new e2c(this, zn2Var);
        }
        Object objA = e2cVar.result;
        int i2 = e2cVar.label;
        ConcurrentHashMap.KeySetView keySetView = this.c;
        Object obj = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                if (v4e.Q(str) || v4e.Q(str2)) {
                    return null;
                }
                d99 d99VarB = b(str);
                e2cVar.L$0 = str;
                e2cVar.L$1 = str2;
                e2cVar.L$2 = d99VarB;
                e2cVar.label = 1;
                if (d99VarB.b(e2cVar) != obj) {
                    str3 = str;
                    d99Var = d99VarB;
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) e2cVar.L$2;
                str4 = (String) e2cVar.L$1;
                try {
                    try {
                        jzb.q(objA);
                        u2cVar = (u2c) objA;
                        if (u2cVar == null) {
                            keySetView.remove(str4);
                        }
                        d99Var = d99Var2;
                        d99Var.h(null);
                        return u2cVar;
                    } catch (Throwable th2) {
                        th = th2;
                        d99Var2.h(null);
                        throw th;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                    keySetView.remove(str4);
                    throw e;
                }
            }
            d99Var = (d99) e2cVar.L$2;
            str2 = (String) e2cVar.L$1;
            str3 = (String) e2cVar.L$0;
            jzb.q(objA);
            if (keySetView.add(str2)) {
                try {
                    a26 f2cVar = new f2c(this, str3, str2, null);
                    e2cVar.L$0 = null;
                    e2cVar.L$1 = str2;
                    e2cVar.L$2 = d99Var;
                    e2cVar.label = 2;
                    objA = a(str3, null, f2cVar, e2cVar);
                    if (objA != obj) {
                        d99Var2 = d99Var;
                        str4 = str2;
                        u2cVar = (u2c) objA;
                        if (u2cVar == null) {
                            keySetView.remove(str4);
                        }
                        d99Var = d99Var2;
                    }
                    return obj;
                } catch (CancellationException e3) {
                    String str5 = str2;
                    e = e3;
                    str4 = str5;
                    keySetView.remove(str4);
                    throw e;
                }
            }
            u2cVar = null;
            d99Var.h(null);
            return u2cVar;
        } catch (Throwable th3) {
            d99 d99Var3 = d99Var;
            th = th3;
            d99Var2 = d99Var3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, Boolean bool, a26 a26Var, xn2 xn2Var) throws Throwable {
        h2c h2cVar;
        String str2;
        d99 d99Var;
        Object obj;
        Throwable th;
        d99 d99Var2;
        if (xn2Var instanceof h2c) {
            h2cVar = (h2c) xn2Var;
            int i = h2cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h2cVar.label = i - Integer.MIN_VALUE;
            } else {
                h2cVar = new h2c(this, xn2Var);
            }
        } else {
            h2cVar = new h2c(this, xn2Var);
        }
        Object objA = h2cVar.result;
        int i2 = h2cVar.label;
        Object obj2 = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                d99 d99VarB = b(str);
                h2cVar.L$0 = str;
                h2cVar.L$1 = bool;
                h2cVar.L$2 = a26Var;
                h2cVar.L$3 = d99VarB;
                h2cVar.label = 1;
                if (d99VarB.b(h2cVar) != obj2) {
                    str2 = str;
                    d99Var = d99VarB;
                    obj = bool;
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) h2cVar.L$3;
                try {
                    jzb.q(objA);
                    d99Var2.h(null);
                    return objA;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99Var = (d99) h2cVar.L$3;
            a26Var = (a26) h2cVar.L$2;
            Object obj3 = h2cVar.L$1;
            str2 = (String) h2cVar.L$0;
            jzb.q(objA);
            obj = obj3;
            h2cVar.L$0 = null;
            h2cVar.L$1 = null;
            h2cVar.L$2 = null;
            h2cVar.L$3 = d99Var;
            h2cVar.label = 2;
            objA = a(str2, obj, a26Var, h2cVar);
            if (objA != obj2) {
                d99Var2 = d99Var;
                d99Var2.h(null);
                return objA;
            }
            return obj2;
        } catch (Throwable th3) {
            d99 d99Var3 = d99Var;
            th = th3;
            d99Var2 = d99Var3;
            d99Var2.h(null);
            throw th;
        }
    }
}
