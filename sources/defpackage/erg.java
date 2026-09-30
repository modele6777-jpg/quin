package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class erg implements Iterable, vqg {
    public final String a;

    public erg(String str) {
        if (str != null) {
            this.a = str;
        } else {
            qc0.j("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.vqg
    public final Boolean a() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.vqg
    public final Iterator c() {
        return new zqg(0, this);
    }

    @Override // defpackage.vqg
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof erg) {
            return this.a.equals(((erg) obj).a);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
  0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vqg
    public final vqg g(String str, kxa kxaVar, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        kxa kxaVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                qc0.j(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strD = "undefined";
        String str3 = this.a;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    jcc.m("hasOwnProperty", 1, arrayList);
                    vqg vqgVarG = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0));
                    boolean zEquals = "length".equals(vqgVarG.d());
                    lng lngVar = vqg.A0;
                    if (zEquals) {
                        return lngVar;
                    }
                    double dDoubleValue = vqgVarG.j().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? vqg.B0 : lngVar;
                }
                qc0.j("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    jcc.m("toString", 0, arrayList);
                    return this;
                }
                qc0.j("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    jcc.m("toLocaleLowerCase", 0, arrayList);
                    return new erg(str3.toLowerCase());
                }
                qc0.j("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    jcc.o(1, "charAt", arrayList);
                    int iT = arrayList.isEmpty() ? 0 : (int) jcc.t(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue());
                    return (iT < 0 || iT >= str3.length()) ? vqg.C0 : new erg(String.valueOf(str3.charAt(iT)));
                }
                qc0.j("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(i4)).d());
                        }
                        return new erg(sb.toString());
                    }
                    return this;
                }
                qc0.j("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    jcc.m("toLowerCase", 0, arrayList);
                    return new erg(str3.toLowerCase(Locale.ENGLISH));
                }
                qc0.j("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    jcc.o(1, "search", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).d()).matcher(str3);
                    return matcher.find() ? new vog(Double.valueOf(matcher.start())) : new vog(Double.valueOf(-1.0d));
                }
                qc0.j("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    jcc.m("toLocaleUpperCase", 0, arrayList);
                    return new erg(str3.toUpperCase());
                }
                qc0.j("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    jcc.o(2, "lastIndexOf", arrayList);
                    String strD2 = arrayList.size() > 0 ? ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).d() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue();
                    return new vog(Double.valueOf(str3.lastIndexOf(strD2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : jcc.t(dDoubleValue2)))));
                }
                qc0.j("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    jcc.m("toUpperCase", 0, arrayList);
                    return new erg(str3.toUpperCase(Locale.ENGLISH));
                }
                qc0.j("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    jcc.m("toUpperCase", 0, arrayList);
                    return new erg(str3.trim());
                }
                qc0.j("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    jcc.o(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).d()).matcher(str3);
                    return matcher2.find() ? new smg(Arrays.asList(new erg(matcher2.group()))) : vqg.w0;
                }
                qc0.j("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    jcc.o(2, "slice", arrayList);
                    double dT = jcc.t(!arrayList.isEmpty() ? ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue() : 0.0d);
                    double dMax = dT < 0.0d ? Math.max(((double) str3.length()) + dT, 0.0d) : Math.min(dT, str3.length());
                    double dT2 = jcc.t(arrayList.size() > 1 ? ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new erg(str3.substring(i5, Math.max(0, ((int) (dT2 < 0.0d ? Math.max(((double) str3.length()) + dT2, 0.0d) : Math.min(dT2, str3.length()))) - i5) + i5));
                }
                qc0.j("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    jcc.o(2, "split", arrayList);
                    if (str3.length() == 0) {
                        return new smg(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strD3 = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).d();
                        long jS = arrayList.size() > 1 ? ((long) jcc.s(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue())) & 4294967295L : 2147483647L;
                        if (jS == 0) {
                            return new smg();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strD3), ((int) jS) + 1);
                        int length = strArrSplit.length;
                        if (!strD3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jS) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new erg(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new smg(arrayList2);
                }
                qc0.j("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    jcc.o(2, "substring", arrayList);
                    int iT2 = !arrayList.isEmpty() ? (int) jcc.t(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).j().doubleValue()) : 0;
                    int iT3 = arrayList.size() > 1 ? (int) jcc.t(((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1)).j().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iT2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iT3, 0), str3.length());
                    return new erg(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                qc0.j("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    jcc.o(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    vqg vqgVarB = vqg.v0;
                    if (!zIsEmpty2) {
                        strD = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(0)).d();
                        if (arrayList.size() > 1) {
                            vqgVarB = ((vea) kxaVar.b).G(kxaVar, (vqg) arrayList.get(1));
                        }
                    }
                    String str4 = strD;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (vqgVarB instanceof qpg) {
                            vqgVarB = ((qpg) vqgVarB).b(kxaVar, Arrays.asList(new erg(str4), new vog(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strD4 = vqgVarB.d();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new erg(ib8.m(new StringBuilder(strSubstring.length() + String.valueOf(strD4).length() + strSubstring2.length()), strSubstring, strD4, strSubstring2));
                    }
                    return this;
                }
                qc0.j("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    jcc.o(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        kxaVar2 = kxaVar;
                    } else {
                        kxaVar2 = kxaVar;
                        strD = ((vea) kxaVar2.b).G(kxaVar2, (vqg) arrayList.get(0)).d();
                    }
                    return new vog(Double.valueOf(str3.indexOf(strD, (int) jcc.t(arrayList.size() < 2 ? 0.0d : ((vea) kxaVar2.b).G(kxaVar2, (vqg) arrayList.get(1)).j().doubleValue()))));
                }
                qc0.j("Command not supported");
                return null;
            default:
                qc0.j("Command not supported");
                return null;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zqg(1, this);
    }

    @Override // defpackage.vqg
    public final Double j() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.vqg
    public final vqg m() {
        return new erg(this.a);
    }

    public final String toString() {
        String str = this.a;
        return ib8.m(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
