package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bsa {
    public static final List a;

    static {
        hs3 hs3Var = xqa.a;
        a = t72.I(xqa.R0, xqa.S0, xqa.T0, xqa.U0);
    }

    public static final Object a(p79 p79Var, hs3 hs3Var, String str, l26 l26Var) {
        if (str.length() == 0) {
            Object objC = p79Var.c(hs3Var.a);
            return objC == null ? hs3Var.b : objC;
        }
        Object objC2 = p79Var.c(((hs3) l26Var.z(hs3Var, str)).a);
        if (objC2 != null) {
            return objC2;
        }
        Object objC3 = p79Var.c(hs3Var.a);
        return objC3 == null ? hs3Var.b : objC3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(hs3 hs3Var, String str, zn2 zn2Var) {
        yqa yqaVar;
        imb imbVar;
        if (zn2Var instanceof yqa) {
            yqaVar = (yqa) zn2Var;
            int i = yqaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqaVar.label = i - Integer.MIN_VALUE;
            } else {
                yqaVar = new yqa(zn2Var);
            }
        } else {
            yqaVar = new yqa(zn2Var);
        }
        Object obj = yqaVar.result;
        int i2 = yqaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            imb imbVar2 = new imb();
            ypa ypaVar = ypa.a;
            zqa zqaVar = new zqa(hs3Var, str, imbVar2, null);
            yqaVar.L$0 = null;
            yqaVar.L$1 = null;
            yqaVar.L$2 = imbVar2;
            yqaVar.label = 1;
            Object objA = ypaVar.a(zqaVar, yqaVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            imbVar = imbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imbVar = (imb) yqaVar.L$2;
            jzb.q(obj);
        }
        return Boolean.valueOf(imbVar.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(hs3 hs3Var, xn2 xn2Var) {
        hra hraVar;
        if (xn2Var instanceof hra) {
            hraVar = (hra) xn2Var;
            int i = hraVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hraVar.label = i - Integer.MIN_VALUE;
            } else {
                hraVar = new hra(xn2Var);
            }
        } else {
            hraVar = new hra(xn2Var);
        }
        Object objB = hraVar.result;
        int i2 = hraVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            ypa.a.getClass();
            wj5 wj5VarB = ypa.b();
            hraVar.L$0 = hs3Var;
            hraVar.label = 1;
            objB = tm7.B(wj5VarB, hraVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hs3Var = (hs3) hraVar.L$0;
            jzb.q(objB);
        }
        Object objC = ((p79) objB).c(hs3Var.a);
        return objC == null ? hs3Var.b : objC;
    }

    public static final String d(hs3 hs3Var) {
        ira iraVar = ira.a;
        return (String) z5c.I(nu4.a, new era(new wf8(hs3Var), hs3Var.b, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(zn2 zn2Var) {
        kra kraVar;
        if (zn2Var instanceof kra) {
            kraVar = (kra) zn2Var;
            int i = kraVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kraVar.label = i - Integer.MIN_VALUE;
            } else {
                kraVar = new kra(zn2Var);
            }
        } else {
            kraVar = new kra(zn2Var);
        }
        Object objC = kraVar.result;
        int i2 = kraVar.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objC);
            hs3 hs3Var = xqa.A;
            kraVar.label = 1;
            objC = c(hs3Var, kraVar);
            if (objC != bw2Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jzb.q(objC);
                return objC;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(objC);
        kraVar.label = 2;
        Object objF = f((String) objC, kraVar);
        return objF == bw2Var ? bw2Var : objF;
    }

    public static final Object f(String str, zn2 zn2Var) {
        return str.length() == 0 ? wef.a : ypa.a.a(new jra(str, null), zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(hs3 hs3Var, hs3 hs3Var2, a26 a26Var, zn2 zn2Var) {
        lra lraVar;
        hs3 hs3Var3;
        a26 a26Var2;
        hs3 hs3Var4;
        String str;
        Object objA;
        if (zn2Var instanceof lra) {
            lraVar = (lra) zn2Var;
            int i = lraVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lraVar.label = i - Integer.MIN_VALUE;
            } else {
                lraVar = new lra(zn2Var);
            }
        } else {
            lraVar = new lra(zn2Var);
        }
        Object objC = lraVar.result;
        int i2 = lraVar.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objC);
            hs3 hs3Var5 = xqa.A;
            lraVar.L$0 = hs3Var;
            lraVar.L$1 = hs3Var2;
            lraVar.L$2 = a26Var;
            lraVar.label = 1;
            objC = c(hs3Var5, lraVar);
            if (objC != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            a26Var = (a26) lraVar.L$2;
            hs3Var2 = (hs3) lraVar.L$1;
            hs3Var = (hs3) lraVar.L$0;
            jzb.q(objC);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objC);
                return objC;
            }
            str = (String) lraVar.L$3;
            a26Var2 = (a26) lraVar.L$2;
            hs3Var3 = (hs3) lraVar.L$1;
            hs3Var4 = (hs3) lraVar.L$0;
            jzb.q(objC);
        }
        hs3 hs3VarK = k(hs3Var4, str);
        hs3 hs3VarK2 = k(hs3Var3, str);
        ypa ypaVar = ypa.a;
        mra mraVar = new mra(hs3VarK, a26Var2, hs3VarK2, null);
        lraVar.L$0 = null;
        lraVar.L$1 = null;
        lraVar.L$2 = null;
        lraVar.L$3 = null;
        lraVar.L$4 = null;
        lraVar.L$5 = null;
        lraVar.label = 3;
        objA = ypaVar.a(mraVar, lraVar);
        if (objA != bw2Var) {
            return bw2Var;
        }
        return objA;
        String str2 = (String) objC;
        lraVar.L$0 = hs3Var;
        lraVar.L$1 = hs3Var2;
        lraVar.L$2 = a26Var;
        lraVar.L$3 = str2;
        lraVar.label = 2;
        if (f(str2, lraVar) != bw2Var) {
            a26 a26Var3 = a26Var;
            hs3Var3 = hs3Var2;
            a26Var2 = a26Var3;
            hs3Var4 = hs3Var;
            str = str2;
            hs3 hs3VarK3 = k(hs3Var4, str);
            hs3 hs3VarK4 = k(hs3Var3, str);
            ypa ypaVar2 = ypa.a;
            mra mraVar2 = new mra(hs3VarK3, a26Var2, hs3VarK4, null);
            lraVar.L$0 = null;
            lraVar.L$1 = null;
            lraVar.L$2 = null;
            lraVar.L$3 = null;
            lraVar.L$4 = null;
            lraVar.L$5 = null;
            lraVar.label = 3;
            objA = ypaVar2.a(mraVar2, lraVar);
            if (objA != bw2Var) {
                return objA;
            }
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(zn2 zn2Var) {
        nra nraVar;
        String str;
        Object objA;
        if (zn2Var instanceof nra) {
            nraVar = (nra) zn2Var;
            int i = nraVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nraVar.label = i - Integer.MIN_VALUE;
            } else {
                nraVar = new nra(zn2Var);
            }
        } else {
            nraVar = new nra(zn2Var);
        }
        Object objC = nraVar.result;
        int i2 = nraVar.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objC);
            hs3 hs3Var = xqa.A;
            nraVar.label = 1;
            objC = c(hs3Var, nraVar);
            if (objC != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            jzb.q(objC);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objC);
                return objC;
            }
            str = (String) nraVar.L$0;
            jzb.q(objC);
        }
        ypa ypaVar = ypa.a;
        ora oraVar = new ora(str, null);
        nraVar.L$0 = null;
        nraVar.label = 3;
        objA = ypaVar.a(oraVar, nraVar);
        if (objA != bw2Var) {
            return bw2Var;
        }
        return objA;
        str = (String) objC;
        nraVar.L$0 = str;
        nraVar.label = 2;
        if (f(str, nraVar) != bw2Var) {
            ypa ypaVar2 = ypa.a;
            ora oraVar2 = new ora(str, null);
            nraVar.L$0 = null;
            nraVar.label = 3;
            objA = ypaVar2.a(oraVar2, nraVar);
            if (objA != bw2Var) {
                return objA;
            }
        }
        return bw2Var;
    }

    public static final hs3 i(hs3 hs3Var, String str) {
        return str.length() == 0 ? hs3Var : new hs3(new isa(ub3.j(hs3Var.a.a, ":", str)), "");
    }

    public static final hs3 j(hs3 hs3Var, String str) {
        return str.length() == 0 ? hs3Var : new hs3(new isa(ub3.j(hs3Var.a.a, ":", str)), Boolean.FALSE);
    }

    public static final hs3 k(hs3 hs3Var, String str) {
        return str.length() == 0 ? hs3Var : new hs3(new isa(ub3.j(hs3Var.a.a, ":", str)), "");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object l(String str, String str2, zn2 zn2Var) {
        sra sraVar;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object objA;
        if (zn2Var instanceof sra) {
            sraVar = (sra) zn2Var;
            int i = sraVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sraVar.label = i - Integer.MIN_VALUE;
            } else {
                sraVar = new sra(zn2Var);
            }
        } else {
            sraVar = new sra(zn2Var);
        }
        Object objC = sraVar.result;
        int i2 = sraVar.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objC);
            hs3 hs3Var = xqa.A;
            str3 = str;
            sraVar.L$0 = str3;
            str4 = str2;
            sraVar.L$1 = str4;
            sraVar.label = 1;
            objC = c(hs3Var, sraVar);
            if (objC != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            String str8 = (String) sraVar.L$1;
            String str9 = (String) sraVar.L$0;
            jzb.q(objC);
            str4 = str8;
            str3 = str9;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objC);
                return objC;
            }
            str7 = (String) sraVar.L$2;
            String str10 = (String) sraVar.L$1;
            String str11 = (String) sraVar.L$0;
            jzb.q(objC);
            str6 = str10;
            str5 = str11;
        }
        hs3 hs3VarK = k(xqa.i, str7);
        hs3 hs3VarK2 = k(xqa.j, str7);
        hs3 hs3VarK3 = k(xqa.k, str7);
        hs3 hs3VarK4 = k(xqa.l, str7);
        ypa ypaVar = ypa.a;
        tra traVar = new tra(str5, hs3VarK, hs3VarK3, str6, hs3VarK2, hs3VarK4, null);
        sraVar.L$0 = null;
        sraVar.L$1 = null;
        sraVar.L$2 = null;
        sraVar.L$3 = null;
        sraVar.L$4 = null;
        sraVar.L$5 = null;
        sraVar.L$6 = null;
        sraVar.label = 3;
        objA = ypaVar.a(traVar, sraVar);
        if (objA != bw2Var) {
            return bw2Var;
        }
        return objA;
        String str12 = (String) objC;
        sraVar.L$0 = str3;
        sraVar.L$1 = str4;
        sraVar.L$2 = str12;
        sraVar.label = 2;
        if (f(str12, sraVar) != bw2Var) {
            str5 = str3;
            str6 = str4;
            str7 = str12;
            hs3 hs3VarK5 = k(xqa.i, str7);
            hs3 hs3VarK6 = k(xqa.j, str7);
            hs3 hs3VarK7 = k(xqa.k, str7);
            hs3 hs3VarK8 = k(xqa.l, str7);
            ypa ypaVar2 = ypa.a;
            tra traVar2 = new tra(str5, hs3VarK5, hs3VarK7, str6, hs3VarK6, hs3VarK8, null);
            sraVar.L$0 = null;
            sraVar.L$1 = null;
            sraVar.L$2 = null;
            sraVar.L$3 = null;
            sraVar.L$4 = null;
            sraVar.L$5 = null;
            sraVar.L$6 = null;
            sraVar.label = 3;
            objA = ypaVar2.a(traVar2, sraVar);
            if (objA != bw2Var) {
                return objA;
            }
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(hs3 hs3Var, hs3 hs3Var2, String str, zn2 zn2Var) {
        ura uraVar;
        hs3 hs3Var3;
        String str2;
        hs3 hs3Var4;
        String str3;
        Object objA;
        if (zn2Var instanceof ura) {
            uraVar = (ura) zn2Var;
            int i = uraVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uraVar.label = i - Integer.MIN_VALUE;
            } else {
                uraVar = new ura(zn2Var);
            }
        } else {
            uraVar = new ura(zn2Var);
        }
        Object objC = uraVar.result;
        int i2 = uraVar.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objC);
            hs3 hs3Var5 = xqa.A;
            uraVar.L$0 = hs3Var;
            uraVar.L$1 = hs3Var2;
            uraVar.L$2 = str;
            uraVar.label = 1;
            objC = c(hs3Var5, uraVar);
            if (objC != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            str = (String) uraVar.L$2;
            hs3Var2 = (hs3) uraVar.L$1;
            hs3Var = (hs3) uraVar.L$0;
            jzb.q(objC);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objC);
                return objC;
            }
            str3 = (String) uraVar.L$3;
            str2 = (String) uraVar.L$2;
            hs3Var3 = (hs3) uraVar.L$1;
            hs3Var4 = (hs3) uraVar.L$0;
            jzb.q(objC);
        }
        hs3 hs3VarK = k(hs3Var4, str3);
        hs3 hs3VarK2 = k(hs3Var3, str3);
        ypa ypaVar = ypa.a;
        vra vraVar = new vra(hs3VarK, str2, hs3VarK2, null);
        uraVar.L$0 = null;
        uraVar.L$1 = null;
        uraVar.L$2 = null;
        uraVar.L$3 = null;
        uraVar.L$4 = null;
        uraVar.L$5 = null;
        uraVar.label = 3;
        objA = ypaVar.a(vraVar, uraVar);
        if (objA != bw2Var) {
            return bw2Var;
        }
        return objA;
        String str4 = (String) objC;
        uraVar.L$0 = hs3Var;
        uraVar.L$1 = hs3Var2;
        uraVar.L$2 = str;
        uraVar.L$3 = str4;
        uraVar.label = 2;
        if (f(str4, uraVar) != bw2Var) {
            String str5 = str;
            hs3Var3 = hs3Var2;
            str2 = str5;
            hs3Var4 = hs3Var;
            str3 = str4;
            hs3 hs3VarK3 = k(hs3Var4, str3);
            hs3 hs3VarK4 = k(hs3Var3, str3);
            ypa ypaVar2 = ypa.a;
            vra vraVar2 = new vra(hs3VarK3, str2, hs3VarK4, null);
            uraVar.L$0 = null;
            uraVar.L$1 = null;
            uraVar.L$2 = null;
            uraVar.L$3 = null;
            uraVar.L$4 = null;
            uraVar.L$5 = null;
            uraVar.label = 3;
            objA = ypaVar2.a(vraVar2, uraVar);
            if (objA != bw2Var) {
                return objA;
            }
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(isa isaVar, Object obj, xn2 xn2Var) {
        wra wraVar;
        Object dzbVar;
        if (xn2Var instanceof wra) {
            wraVar = (wra) xn2Var;
            int i = wraVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wraVar.label = i - Integer.MIN_VALUE;
            } else {
                wraVar = new wra(xn2Var);
            }
        } else {
            wraVar = new wra(xn2Var);
        }
        Object obj2 = wraVar.result;
        int i2 = wraVar.label;
        wef wefVar = wef.a;
        try {
            if (i2 == 0) {
                jzb.q(obj2);
                ypa ypaVar = ypa.a;
                xra xraVar = new xra(isaVar, obj, null);
                wraVar.L$0 = isaVar;
                wraVar.L$1 = obj;
                wraVar.L$2 = null;
                wraVar.label = 1;
                Object objA = ypaVar.a(xraVar, wraVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = wraVar.L$1;
                isaVar = (isa) wraVar.L$0;
                jzb.q(obj2);
            }
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("Preference").c(kv2.n("Failed to set ", isaVar.a, " with ", obj), thA);
        }
        return wefVar;
    }

    public static final Object o(isa isaVar, Object obj, xn2 xn2Var) {
        return ypa.a.a(new yra(isaVar, obj, null), xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object p(int i, n26 n26Var, zn2 zn2Var) {
        zra zraVar;
        n26 n26Var2;
        String str;
        Object objA;
        if (zn2Var instanceof zra) {
            zraVar = (zra) zn2Var;
            int i2 = zraVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zraVar.label = i2 - Integer.MIN_VALUE;
            } else {
                zraVar = new zra(zn2Var);
            }
        } else {
            zraVar = new zra(zn2Var);
        }
        Object objC = zraVar.result;
        int i3 = zraVar.label;
        bw2 bw2Var = bw2.a;
        if (i3 == 0) {
            jzb.q(objC);
            if (1 > i || i >= 5) {
                qc0.o(tec.e(i, "Unknown notification touchpoint: "));
                return null;
            }
            hs3 hs3Var = xqa.A;
            zraVar.L$0 = n26Var;
            zraVar.I$0 = i;
            zraVar.label = 1;
            objC = c(hs3Var, zraVar);
            if (objC != bw2Var) {
            }
            return bw2Var;
        }
        if (i3 == 1) {
            i = zraVar.I$0;
            n26Var = (n26) zraVar.L$0;
            jzb.q(objC);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objC);
                return objC;
            }
            i = zraVar.I$0;
            str = (String) zraVar.L$1;
            n26Var2 = (n26) zraVar.L$0;
            jzb.q(objC);
        }
        hs3 hs3VarJ = j((hs3) a.get(i - 1), str);
        hs3 hs3VarI = i(xqa.V0, str);
        ypa ypaVar = ypa.a;
        asa asaVar = new asa(n26Var2, hs3VarJ, hs3VarI, null);
        zraVar.L$0 = null;
        zraVar.L$1 = null;
        zraVar.L$2 = null;
        zraVar.L$3 = null;
        zraVar.I$0 = i;
        zraVar.label = 3;
        objA = ypaVar.a(asaVar, zraVar);
        if (objA != bw2Var) {
            return bw2Var;
        }
        return objA;
        String str2 = (String) objC;
        zraVar.L$0 = n26Var;
        zraVar.L$1 = str2;
        zraVar.I$0 = i;
        zraVar.label = 2;
        if (f(str2, zraVar) != bw2Var) {
            n26Var2 = n26Var;
            str = str2;
            hs3 hs3VarJ2 = j((hs3) a.get(i - 1), str);
            hs3 hs3VarI2 = i(xqa.V0, str);
            ypa ypaVar2 = ypa.a;
            asa asaVar2 = new asa(n26Var2, hs3VarJ2, hs3VarI2, null);
            zraVar.L$0 = null;
            zraVar.L$1 = null;
            zraVar.L$2 = null;
            zraVar.L$3 = null;
            zraVar.I$0 = i;
            zraVar.label = 3;
            objA = ypaVar2.a(asaVar2, zraVar);
            if (objA != bw2Var) {
                return objA;
            }
        }
        return bw2Var;
    }
}
