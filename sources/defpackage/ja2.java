package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ja2 {
    public final bt6 a;

    public ja2() {
        g0a g0aVar = new g0a();
        for (i85 i85Var : (ArrayList) qd0.k0(new i85[]{new l4e(1), new l4e(0), new xq0()})) {
            if (i85Var instanceof h0a) {
                ((h0a) i85Var).a(g0aVar);
            }
        }
        this.a = new bt6(g0aVar);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    public final rf0 a(String str) {
        z5c zf0Var;
        String str2;
        z5c pf0Var;
        rf0 rf0Var;
        str.getClass();
        bg4 bg4VarC = this.a.c(str);
        mmb mmbVar = new mmb();
        ad0 ad0Var = new ad0();
        ad0Var.addLast(new au2(bg4VarC, null, new up(mmbVar, 1)));
        while (!ad0Var.isEmpty()) {
            au2 au2Var = (au2) ad0Var.removeLast();
            sf9 sf9Var = au2Var.a;
            rf0 rf0Var2 = au2Var.b;
            sf9 sf9Var2 = null;
            rf0 rf0Var3 = null;
            rf0 rf0Var4 = null;
            while (sf9Var != null) {
                int i = 0;
                if (sf9Var instanceof e01) {
                    zf0Var = bf0.l;
                } else if (sf9Var instanceof r51) {
                    r51 r51Var = (r51) sf9Var;
                    String str3 = r51Var.g;
                    zf0Var = new jg0((str3 == null || str3.isEmpty()) ? (char) 0 : r51Var.g.charAt(0));
                } else if (sf9Var instanceof n62) {
                    String str4 = ((n62) sf9Var).g;
                    str4.getClass();
                    zf0Var = new cf0(str4);
                } else if (sf9Var instanceof bg4) {
                    zf0Var = ef0.l;
                } else if (sf9Var instanceof gu4) {
                    String str5 = ((gu4) sf9Var).g;
                    str5.getClass();
                    zf0Var = new ff0(str5);
                } else if (sf9Var instanceof lc5) {
                    lc5 lc5Var = (lc5) sf9Var;
                    String str6 = lc5Var.l;
                    str6.getClass();
                    String str7 = lc5Var.g;
                    char cCharAt = (str7 == null || str7.isEmpty()) ? (char) 0 : lc5Var.g.charAt(0);
                    int i2 = lc5Var.j;
                    Integer num = lc5Var.h;
                    int iIntValue = num != null ? num.intValue() : 0;
                    String str8 = lc5Var.k;
                    str8.getClass();
                    zf0Var = new gf0(cCharAt, iIntValue, i2, str8, str6);
                } else if (sf9Var instanceof ih6) {
                    zf0Var = hf0.l;
                } else if (sf9Var instanceof ti6) {
                    zf0Var = new if0(((ti6) sf9Var).g);
                } else if (sf9Var instanceof bve) {
                    zf0Var = ig0.l;
                } else if (sf9Var instanceof mr6) {
                    String str9 = ((mr6) sf9Var).g;
                    str9.getClass();
                    zf0Var = new kf0(str9);
                } else if (sf9Var instanceof kr6) {
                    String str10 = ((kr6) sf9Var).g;
                    str10.getClass();
                    zf0Var = new jf0(str10);
                } else {
                    if (sf9Var instanceof av6) {
                        av6 av6Var = (av6) sf9Var;
                        String str11 = av6Var.g;
                        if (str11 == null) {
                            zf0Var = null;
                        } else {
                            String str12 = av6Var.h;
                            pf0Var = new lf0(str12 != null ? str12 : "", str11);
                            zf0Var = pf0Var;
                        }
                    } else if (sf9Var instanceof i17) {
                        String str13 = ((i17) sf9Var).g;
                        str13.getClass();
                        zf0Var = new mf0(str13);
                    } else if (sf9Var instanceof i68) {
                        i68 i68Var = (i68) sf9Var;
                        String str14 = i68Var.h;
                        str2 = str14 != null ? str14 : "";
                        String str15 = i68Var.g;
                        str15.getClass();
                        zf0Var = new of0(str15, str2);
                    } else if (sf9Var instanceof p78) {
                        zf0Var = qf0.l;
                    } else if (sf9Var instanceof ds9) {
                        ds9 ds9Var = (ds9) sf9Var;
                        Integer num2 = ds9Var.h;
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        String str16 = ds9Var.g;
                        zf0Var = new wf0(iIntValue2, (str16 == null || str16.isEmpty()) ? (char) 0 : ds9Var.g.charAt(0));
                    } else if (sf9Var instanceof ny9) {
                        zf0Var = xf0.l;
                    } else if (sf9Var instanceof usd) {
                        zf0Var = yf0.l;
                    } else if (sf9Var instanceof f5e) {
                        String str17 = ((f5e) sf9Var).g;
                        str17.getClass();
                        zf0Var = new ag0(str17);
                    } else if (sf9Var instanceof ime) {
                        String str18 = ((ime) sf9Var).g;
                        str18.getClass();
                        zf0Var = new hg0(str18);
                    } else if (sf9Var instanceof o68) {
                        o68 o68Var = (o68) sf9Var;
                        String str19 = o68Var.i;
                        str2 = str19 != null ? str19 : "";
                        String str20 = o68Var.h;
                        str20.getClass();
                        String str21 = o68Var.g;
                        str21.getClass();
                        pf0Var = new pf0(str21, str20, str2);
                        zf0Var = pf0Var;
                    } else if (sf9Var instanceof dde) {
                        zf0Var = fg0.l;
                    } else if (sf9Var instanceof jde) {
                        zf0Var = eg0.l;
                    } else if (sf9Var instanceof gde) {
                        zf0Var = bg0.l;
                    } else if (sf9Var instanceof sde) {
                        zf0Var = gg0.l;
                    } else if (sf9Var instanceof ide) {
                        ide ideVar = (ide) sf9Var;
                        boolean z = ideVar.g;
                        int i3 = ideVar.h;
                        int i4 = i3 == 0 ? -1 : tf0.a[kv2.B(i3)];
                        dg0 dg0Var = dg0.a;
                        if (i4 != -1 && i4 != 1) {
                            if (i4 == 2) {
                                dg0Var = dg0.b;
                            } else if (i4 == 3) {
                                dg0Var = dg0.c;
                            }
                        }
                        zf0Var = new cg0(z, dg0Var);
                    } else if (sf9Var instanceof j4e) {
                        String str22 = ((j4e) sf9Var).g;
                        str22.getClass();
                        zf0Var = new zf0(str22);
                    } else {
                        zf0Var = null;
                    }
                }
                if (zf0Var != null) {
                    rf0 rf0Var5 = rf0Var3 == null ? null : rf0Var3;
                    uf0 uf0Var = new uf0();
                    uf0Var.a = rf0Var2;
                    uf0Var.b = null;
                    uf0Var.c = null;
                    uf0Var.d = rf0Var5;
                    uf0Var.e = null;
                    rf0Var = new rf0(zf0Var, uf0Var);
                } else {
                    rf0Var = null;
                }
                if (rf0Var != null) {
                    if (rf0Var4 == null) {
                        rf0Var4 = rf0Var;
                    }
                    if (rf0Var3 != null) {
                        rf0Var3.b.e = rf0Var;
                    }
                    sf9 sf9Var3 = sf9Var.b;
                    if (sf9Var3 != null) {
                        ad0Var.addLast(new au2(sf9Var3, rf0Var, new sf0(rf0Var, i)));
                    }
                    sf9Var = sf9Var.e;
                    rf0Var3 = rf0Var;
                } else {
                    sf9Var2 = sf9Var;
                    sf9Var = null;
                }
            }
            if (sf9Var2 != null) {
                if (sf9Var2.e == null && rf0Var2 != null) {
                    rf0Var2.b.c = null;
                }
            } else if (rf0Var2 != null) {
                rf0Var2.b.c = rf0Var3;
            }
            au2Var.c.d(rf0Var4);
        }
        rf0 rf0Var6 = (rf0) mmbVar.element;
        if (rf0Var6 != null) {
            return rf0Var6;
        }
        qc0.j("Could not convert the generated Commonmark Node into an ASTNode!");
        return null;
    }
}
