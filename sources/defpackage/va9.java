package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class va9 {
    public final String a;
    public final int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Serializable f;

    public va9(fc9 fc9Var, em7 em7Var, Map map) {
        String str;
        int iE = em7Var != null ? m7c.e(hfc.l(em7Var)) : -1;
        if (em7Var != null) {
            xn7 xn7VarL = hfc.l(em7Var);
            if (xn7VarL instanceof aja) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                em7 em7VarC = k99.C(((aja) xn7VarL).e());
                throw new IllegalArgumentException(ks0.l(sb, em7VarC != null ? em7VarC.r() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            kxa kxaVar = new kxa(xn7VarL);
            g20 g20Var = new g20(28, kxaVar);
            int iE2 = xn7VarL.e().e();
            for (int i = 0; i < iE2; i++) {
                String strF = xn7VarL.e().f(i);
                ub9 ub9VarA = m7c.a(xn7VarL.e().i(i), map);
                if (ub9VarA == null) {
                    qc0.j(m7c.u(strF, xn7VarL.e().i(i).a(), xn7VarL.e().a(), map.toString()));
                    throw null;
                }
                g20Var.m(Integer.valueOf(i), strF, ub9VarA);
            }
            str = ((String) kxaVar.b) + ((String) kxaVar.c) + ((String) kxaVar.d);
        } else {
            str = null;
        }
        this.c = fc9Var;
        this.b = iE;
        this.a = str;
        this.d = new LinkedHashMap();
        this.f = new ArrayList();
        this.e = new LinkedHashMap();
        if (em7Var != null) {
            xn7 xn7VarL2 = hfc.l(em7Var);
            if (xn7VarL2 instanceof aja) {
                r3.m(xn7VarL2, ". Arguments can only be generated from concrete classes or objects.", "Cannot generate NavArguments for polymorphic serializer ");
                throw null;
            }
            int iE3 = xn7VarL2.e().e();
            ArrayList<y99> arrayList = new ArrayList(iE3);
            for (int i2 = 0; i2 < iE3; i2++) {
                String strF2 = xn7VarL2.e().f(i2);
                strF2.getClass();
                nyc nycVarI = xn7VarL2.e().i(i2);
                boolean zC = nycVarI.c();
                ub9 ub9VarA2 = m7c.a(nycVarI, map);
                if (ub9VarA2 == null) {
                    qc0.j(m7c.u(strF2, nycVarI.a(), xn7VarL2.e().a(), map.toString()));
                    throw null;
                }
                arrayList.add(new y99(strF2, new ca9(ub9VarA2, zC, xn7VarL2.e().j(i2))));
            }
            for (y99 y99Var : arrayList) {
                ((LinkedHashMap) this.d).put(y99Var.a, y99Var.b);
            }
        }
    }

    public static Boolean f(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean g(String str, wyg wygVar, w0h w0hVar) {
        List listW;
        oa7.A(wygVar);
        if (str != null && wygVar.r() && wygVar.z() != 1 && (wygVar.z() != 7 ? wygVar.s() : wygVar.x() != 0)) {
            int iZ = wygVar.z();
            boolean zV = wygVar.v();
            String strT = (zV || iZ == 2 || iZ == 7) ? wygVar.t() : wygVar.t().toUpperCase(Locale.ENGLISH);
            if (wygVar.x() == 0) {
                listW = null;
            } else {
                listW = wygVar.w();
                if (!zV) {
                    ArrayList arrayList = new ArrayList(listW.size());
                    Iterator it = listW.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listW = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iZ == 2 ? strT : null;
            if (iZ != 7 ? strT != null : listW != null && !listW.isEmpty()) {
                if (!zV && iZ != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iZ - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zV ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (w0hVar != null) {
                                    w0hVar.x.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strT));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strT));
                    case 4:
                        return Boolean.valueOf(str.contains(strT));
                    case 5:
                        return Boolean.valueOf(str.equals(strT));
                    case 6:
                        if (listW != null) {
                            return Boolean.valueOf(listW.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    public static Boolean h(BigDecimal bigDecimal, qyg qygVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        oa7.A(qygVar);
        if (qygVar.r()) {
            if (qygVar.B() != 1 && (qygVar.B() != 5 ? qygVar.u() : qygVar.w() && qygVar.y())) {
                int iB = qygVar.B();
                try {
                    if (qygVar.B() == 5) {
                        if (lch.e1(qygVar.x()) && lch.e1(qygVar.z())) {
                            BigDecimal bigDecimal5 = new BigDecimal(qygVar.x());
                            bigDecimal4 = new BigDecimal(qygVar.z());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iB == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iB - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (lch.e1(qygVar.v())) {
                        bigDecimal2 = new BigDecimal(qygVar.v());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iB == 5) {
                            i = iB - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iB - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public ua9 a() {
        ua9 ua9VarB = b();
        ua9VarB.getClass();
        a80 a80Var = ua9VarB.b;
        for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
            String str = (String) entry.getKey();
            ca9 ca9Var = (ca9) entry.getValue();
            str.getClass();
            ca9Var.getClass();
            a80Var.getClass();
            ((LinkedHashMap) a80Var.e).put(str, ca9Var);
        }
        for (final sa9 sa9Var : (ArrayList) this.f) {
            sa9Var.getClass();
            a80Var.getClass();
            final int i = 0;
            ArrayList arrayListA = y7h.A((LinkedHashMap) a80Var.e, new a26() { // from class: wa9
                @Override // defpackage.a26
                public final Object d(Object obj) {
                    boolean zContains;
                    int i2 = i;
                    sa9 sa9Var2 = sa9Var;
                    String str2 = (String) obj;
                    switch (i2) {
                        case 0:
                            str2.getClass();
                            zContains = sa9Var2.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            zContains = sa9Var2.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListA.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + sa9Var.a + " can't be used to open destination " + ((ua9) a80Var.c) + ".\nFollowing required arguments are missing: " + arrayListA).toString());
            }
            ((ArrayList) a80Var.d).add(sa9Var);
        }
        Iterator it = ((LinkedHashMap) this.e).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            r3.f();
            return null;
        }
        String str2 = this.a;
        if (str2 != null) {
            a80Var.getClass();
            if (v4e.Q(str2)) {
                qc0.j("Cannot have an empty route");
                return null;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            final sa9 sa9Var2 = new sa9(strConcat);
            final int i2 = 1;
            ArrayList arrayListA2 = y7h.A((LinkedHashMap) a80Var.e, new a26() { // from class: wa9
                @Override // defpackage.a26
                public final Object d(Object obj) {
                    boolean zContains;
                    int i3 = i2;
                    sa9 sa9Var3 = sa9Var2;
                    String str3 = (String) obj;
                    switch (i3) {
                        case 0:
                            str3.getClass();
                            zContains = sa9Var3.c().contains(str3);
                            break;
                        default:
                            str3.getClass();
                            zContains = sa9Var3.c().contains(str3);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListA2.isEmpty()) {
                StringBuilder sbP = tec.p("Cannot set route \"", str2, "\" for destination ");
                sbP.append((ua9) a80Var.c);
                sbP.append(". Following required arguments are missing: ");
                sbP.append(arrayListA2);
                throw new IllegalArgumentException(sbP.toString().toString());
            }
            a80Var.g = new ace(new t8(strConcat, 8));
            a80Var.b = strConcat.hashCode();
            a80Var.f = str2;
        }
        int i3 = this.b;
        if (i3 != -1) {
            a80Var.b = i3;
        }
        return ua9VarB;
    }

    public ua9 b() {
        return ((fc9) this.c).a();
    }

    public abstract int c();

    public abstract boolean d();

    public abstract boolean e();

    public va9(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
