package defpackage;

import android.net.Uri;
import android.os.Bundle;
import io.sentry.q6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sa9 {
    public static final rob m = new rob("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final rob n = new rob("\\{(.+?)\\}");
    public static final rob o = new rob("http[s]?://");
    public static final rob p = new rob(q6.DEFAULT_PROPAGATION_TARGETS);
    public static final rob q = new rob("([^/]*?|)");
    public static final rob r = new rob("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final ace d;
    public final ace e;
    public final lw7 f;
    public boolean g;
    public final lw7 h;
    public final lw7 i;
    public final lw7 j;
    public final ace k;
    public final boolean l;

    public sa9(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.d = new ace(new x16(this) { // from class: pa9
            public final /* synthetic */ sa9 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                List list;
                int i2 = i;
                sa9 sa9Var = this.b;
                switch (i2) {
                    case 0:
                        String str2 = sa9Var.c;
                        if (str2 != null) {
                            return new rob(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(sa9.r.g(sa9Var.a));
                    case 2:
                        String str3 = sa9Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    qc0.o(tec.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) s72.x0(queryParameters);
                                if (str5 == null) {
                                    sa9Var.g = true;
                                    str5 = str4;
                                }
                                ra9 ra9Var = new ra9();
                                int i3 = 0;
                                for (um8 um8VarB = rob.b(sa9.n, str5); um8VarB != null; um8VarB = um8VarB.c()) {
                                    rm8 rm8VarD = um8VarB.c.d(1);
                                    rm8VarD.getClass();
                                    ra9Var.b.add(rm8VarD.a);
                                    if (um8VarB.b().a > i3) {
                                        String strQuote = Pattern.quote(str5.substring(i3, um8VarB.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = um8VarB.b().b + 1;
                                }
                                if (i3 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i3));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                ra9Var.a = sa9.h(sb.toString());
                                linkedHashMap.put(str4, ra9Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = sa9Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sa9.a(fragment, arrayList2, sb2);
                        return new iy9(arrayList2, sb2.toString());
                    case 4:
                        iy9 iy9Var = (iy9) sa9Var.h.getValue();
                        return (iy9Var == null || (list = (List) iy9Var.d()) == null) ? new ArrayList() : list;
                    case 5:
                        iy9 iy9Var2 = (iy9) sa9Var.h.getValue();
                        if (iy9Var2 != null) {
                            return (String) iy9Var2.e();
                        }
                        return null;
                    case 6:
                        String str7 = (String) sa9Var.j.getValue();
                        if (str7 != null) {
                            return new rob(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.e = new ace(new x16(this) { // from class: pa9
            public final /* synthetic */ sa9 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                List list;
                int i3 = i2;
                sa9 sa9Var = this.b;
                switch (i3) {
                    case 0:
                        String str2 = sa9Var.c;
                        if (str2 != null) {
                            return new rob(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(sa9.r.g(sa9Var.a));
                    case 2:
                        String str3 = sa9Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    qc0.o(tec.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) s72.x0(queryParameters);
                                if (str5 == null) {
                                    sa9Var.g = true;
                                    str5 = str4;
                                }
                                ra9 ra9Var = new ra9();
                                int i4 = 0;
                                for (um8 um8VarB = rob.b(sa9.n, str5); um8VarB != null; um8VarB = um8VarB.c()) {
                                    rm8 rm8VarD = um8VarB.c.d(1);
                                    rm8VarD.getClass();
                                    ra9Var.b.add(rm8VarD.a);
                                    if (um8VarB.b().a > i4) {
                                        String strQuote = Pattern.quote(str5.substring(i4, um8VarB.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = um8VarB.b().b + 1;
                                }
                                if (i4 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i4));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                ra9Var.a = sa9.h(sb.toString());
                                linkedHashMap.put(str4, ra9Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = sa9Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sa9.a(fragment, arrayList2, sb2);
                        return new iy9(arrayList2, sb2.toString());
                    case 4:
                        iy9 iy9Var = (iy9) sa9Var.h.getValue();
                        return (iy9Var == null || (list = (List) iy9Var.d()) == null) ? new ArrayList() : list;
                    case 5:
                        iy9 iy9Var2 = (iy9) sa9Var.h.getValue();
                        if (iy9Var2 != null) {
                            return (String) iy9Var2.e();
                        }
                        return null;
                    case 6:
                        String str7 = (String) sa9Var.j.getValue();
                        if (str7 != null) {
                            return new rob(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        x16 x16Var = new x16(this) { // from class: pa9
            public final /* synthetic */ sa9 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                List list;
                int i4 = i3;
                sa9 sa9Var = this.b;
                switch (i4) {
                    case 0:
                        String str2 = sa9Var.c;
                        if (str2 != null) {
                            return new rob(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(sa9.r.g(sa9Var.a));
                    case 2:
                        String str3 = sa9Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    qc0.o(tec.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) s72.x0(queryParameters);
                                if (str5 == null) {
                                    sa9Var.g = true;
                                    str5 = str4;
                                }
                                ra9 ra9Var = new ra9();
                                int i5 = 0;
                                for (um8 um8VarB = rob.b(sa9.n, str5); um8VarB != null; um8VarB = um8VarB.c()) {
                                    rm8 rm8VarD = um8VarB.c.d(1);
                                    rm8VarD.getClass();
                                    ra9Var.b.add(rm8VarD.a);
                                    if (um8VarB.b().a > i5) {
                                        String strQuote = Pattern.quote(str5.substring(i5, um8VarB.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i5 = um8VarB.b().b + 1;
                                }
                                if (i5 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i5));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                ra9Var.a = sa9.h(sb.toString());
                                linkedHashMap.put(str4, ra9Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = sa9Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sa9.a(fragment, arrayList2, sb2);
                        return new iy9(arrayList2, sb2.toString());
                    case 4:
                        iy9 iy9Var = (iy9) sa9Var.h.getValue();
                        return (iy9Var == null || (list = (List) iy9Var.d()) == null) ? new ArrayList() : list;
                    case 5:
                        iy9 iy9Var2 = (iy9) sa9Var.h.getValue();
                        if (iy9Var2 != null) {
                            return (String) iy9Var2.e();
                        }
                        return null;
                    case 6:
                        String str7 = (String) sa9Var.j.getValue();
                        if (str7 != null) {
                            return new rob(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        z18 z18Var = z18.c;
        this.f = eb3.N(z18Var, x16Var);
        final int i4 = 3;
        this.h = eb3.N(z18Var, new x16(this) { // from class: pa9
            public final /* synthetic */ sa9 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                List list;
                int i5 = i4;
                sa9 sa9Var = this.b;
                switch (i5) {
                    case 0:
                        String str2 = sa9Var.c;
                        if (str2 != null) {
                            return new rob(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(sa9.r.g(sa9Var.a));
                    case 2:
                        String str3 = sa9Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    qc0.o(tec.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) s72.x0(queryParameters);
                                if (str5 == null) {
                                    sa9Var.g = true;
                                    str5 = str4;
                                }
                                ra9 ra9Var = new ra9();
                                int i6 = 0;
                                for (um8 um8VarB = rob.b(sa9.n, str5); um8VarB != null; um8VarB = um8VarB.c()) {
                                    rm8 rm8VarD = um8VarB.c.d(1);
                                    rm8VarD.getClass();
                                    ra9Var.b.add(rm8VarD.a);
                                    if (um8VarB.b().a > i6) {
                                        String strQuote = Pattern.quote(str5.substring(i6, um8VarB.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i6 = um8VarB.b().b + 1;
                                }
                                if (i6 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i6));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                ra9Var.a = sa9.h(sb.toString());
                                linkedHashMap.put(str4, ra9Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = sa9Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sa9.a(fragment, arrayList2, sb2);
                        return new iy9(arrayList2, sb2.toString());
                    case 4:
                        iy9 iy9Var = (iy9) sa9Var.h.getValue();
                        return (iy9Var == null || (list = (List) iy9Var.d()) == null) ? new ArrayList() : list;
                    case 5:
                        iy9 iy9Var2 = (iy9) sa9Var.h.getValue();
                        if (iy9Var2 != null) {
                            return (String) iy9Var2.e();
                        }
                        return null;
                    case 6:
                        String str7 = (String) sa9Var.j.getValue();
                        if (str7 != null) {
                            return new rob(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.i = eb3.N(z18Var, new x16(this) { // from class: pa9
            public final /* synthetic */ sa9 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                List list;
                int i6 = i5;
                sa9 sa9Var = this.b;
                switch (i6) {
                    case 0:
                        String str2 = sa9Var.c;
                        if (str2 != null) {
                            return new rob(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(sa9.r.g(sa9Var.a));
                    case 2:
                        String str3 = sa9Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    qc0.o(tec.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) s72.x0(queryParameters);
                                if (str5 == null) {
                                    sa9Var.g = true;
                                    str5 = str4;
                                }
                                ra9 ra9Var = new ra9();
                                int i7 = 0;
                                for (um8 um8VarB = rob.b(sa9.n, str5); um8VarB != null; um8VarB = um8VarB.c()) {
                                    rm8 rm8VarD = um8VarB.c.d(1);
                                    rm8VarD.getClass();
                                    ra9Var.b.add(rm8VarD.a);
                                    if (um8VarB.b().a > i7) {
                                        String strQuote = Pattern.quote(str5.substring(i7, um8VarB.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i7 = um8VarB.b().b + 1;
                                }
                                if (i7 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i7));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                ra9Var.a = sa9.h(sb.toString());
                                linkedHashMap.put(str4, ra9Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = sa9Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sa9.a(fragment, arrayList2, sb2);
                        return new iy9(arrayList2, sb2.toString());
                    case 4:
                        iy9 iy9Var = (iy9) sa9Var.h.getValue();
                        return (iy9Var == null || (list = (List) iy9Var.d()) == null) ? new ArrayList() : list;
                    case 5:
                        iy9 iy9Var2 = (iy9) sa9Var.h.getValue();
                        if (iy9Var2 != null) {
                            return (String) iy9Var2.e();
                        }
                        return null;
                    case 6:
                        String str7 = (String) sa9Var.j.getValue();
                        if (str7 != null) {
                            return new rob(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.j = eb3.N(z18Var, new x16(this) { // from class: pa9
            public final /* synthetic */ sa9 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                List list;
                int i7 = i6;
                sa9 sa9Var = this.b;
                switch (i7) {
                    case 0:
                        String str2 = sa9Var.c;
                        if (str2 != null) {
                            return new rob(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(sa9.r.g(sa9Var.a));
                    case 2:
                        String str3 = sa9Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    qc0.o(tec.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) s72.x0(queryParameters);
                                if (str5 == null) {
                                    sa9Var.g = true;
                                    str5 = str4;
                                }
                                ra9 ra9Var = new ra9();
                                int i8 = 0;
                                for (um8 um8VarB = rob.b(sa9.n, str5); um8VarB != null; um8VarB = um8VarB.c()) {
                                    rm8 rm8VarD = um8VarB.c.d(1);
                                    rm8VarD.getClass();
                                    ra9Var.b.add(rm8VarD.a);
                                    if (um8VarB.b().a > i8) {
                                        String strQuote = Pattern.quote(str5.substring(i8, um8VarB.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = um8VarB.b().b + 1;
                                }
                                if (i8 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i8));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                ra9Var.a = sa9.h(sb.toString());
                                linkedHashMap.put(str4, ra9Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = sa9Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sa9.a(fragment, arrayList2, sb2);
                        return new iy9(arrayList2, sb2.toString());
                    case 4:
                        iy9 iy9Var = (iy9) sa9Var.h.getValue();
                        return (iy9Var == null || (list = (List) iy9Var.d()) == null) ? new ArrayList() : list;
                    case 5:
                        iy9 iy9Var2 = (iy9) sa9Var.h.getValue();
                        if (iy9Var2 != null) {
                            return (String) iy9Var2.e();
                        }
                        return null;
                    case 6:
                        String str7 = (String) sa9Var.j.getValue();
                        if (str7 != null) {
                            return new rob(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.k = new ace(new x16(this) { // from class: pa9
            public final /* synthetic */ sa9 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                List list;
                int i8 = i7;
                sa9 sa9Var = this.b;
                switch (i8) {
                    case 0:
                        String str2 = sa9Var.c;
                        if (str2 != null) {
                            return new rob(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(sa9.r.g(sa9Var.a));
                    case 2:
                        String str3 = sa9Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    qc0.o(tec.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) s72.x0(queryParameters);
                                if (str5 == null) {
                                    sa9Var.g = true;
                                    str5 = str4;
                                }
                                ra9 ra9Var = new ra9();
                                int i9 = 0;
                                for (um8 um8VarB = rob.b(sa9.n, str5); um8VarB != null; um8VarB = um8VarB.c()) {
                                    rm8 rm8VarD = um8VarB.c.d(1);
                                    rm8VarD.getClass();
                                    ra9Var.b.add(rm8VarD.a);
                                    if (um8VarB.b().a > i9) {
                                        String strQuote = Pattern.quote(str5.substring(i9, um8VarB.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i9 = um8VarB.b().b + 1;
                                }
                                if (i9 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i9));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                ra9Var.a = sa9.h(sb.toString());
                                linkedHashMap.put(str4, ra9Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = sa9Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sa9.a(fragment, arrayList2, sb2);
                        return new iy9(arrayList2, sb2.toString());
                    case 4:
                        iy9 iy9Var = (iy9) sa9Var.h.getValue();
                        return (iy9Var == null || (list = (List) iy9Var.d()) == null) ? new ArrayList() : list;
                    case 5:
                        iy9 iy9Var2 = (iy9) sa9Var.h.getValue();
                        if (iy9Var2 != null) {
                            return (String) iy9Var2.e();
                        }
                        return null;
                    case 6:
                        String str7 = (String) sa9Var.j.getValue();
                        if (str7 != null) {
                            return new rob(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new ace(new x16(this) { // from class: pa9
            public final /* synthetic */ sa9 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                List list;
                int i9 = i8;
                sa9 sa9Var = this.b;
                switch (i9) {
                    case 0:
                        String str2 = sa9Var.c;
                        if (str2 != null) {
                            return new rob(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(sa9.r.g(sa9Var.a));
                    case 2:
                        String str3 = sa9Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                            Uri uri = Uri.parse(str3);
                            uri.getClass();
                            for (String str4 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str4);
                                if (queryParameters.size() > 1) {
                                    qc0.o(tec.m("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str5 = (String) s72.x0(queryParameters);
                                if (str5 == null) {
                                    sa9Var.g = true;
                                    str5 = str4;
                                }
                                ra9 ra9Var = new ra9();
                                int i10 = 0;
                                for (um8 um8VarB = rob.b(sa9.n, str5); um8VarB != null; um8VarB = um8VarB.c()) {
                                    rm8 rm8VarD = um8VarB.c.d(1);
                                    rm8VarD.getClass();
                                    ra9Var.b.add(rm8VarD.a);
                                    if (um8VarB.b().a > i10) {
                                        String strQuote = Pattern.quote(str5.substring(i10, um8VarB.b().a));
                                        strQuote.getClass();
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i10 = um8VarB.b().b + 1;
                                }
                                if (i10 < str5.length()) {
                                    String strQuote2 = Pattern.quote(str5.substring(i10));
                                    strQuote2.getClass();
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                ra9Var.a = sa9.h(sb.toString());
                                linkedHashMap.put(str4, ra9Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = sa9Var.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        sa9.a(fragment, arrayList2, sb2);
                        return new iy9(arrayList2, sb2.toString());
                    case 4:
                        iy9 iy9Var = (iy9) sa9Var.h.getValue();
                        return (iy9Var == null || (list = (List) iy9Var.d()) == null) ? new ArrayList() : list;
                    case 5:
                        iy9 iy9Var2 = (iy9) sa9Var.h.getValue();
                        if (iy9Var2 != null) {
                            return (String) iy9Var2.e();
                        }
                        return null;
                    case 6:
                        String str7 = (String) sa9Var.j.getValue();
                        if (str7 != null) {
                            return new rob(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!m.a(str)) {
            sb.append(o.c());
        }
        um8 um8VarB = rob.b(new rob("(\\?|#|$)"), str);
        if (um8VarB != null) {
            a(str.substring(0, um8VarB.b().a), arrayList, sb);
            if (!p.a(sb) && !q.a(sb)) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = h(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (um8 um8VarB = rob.b(n, str); um8VarB != null; um8VarB = um8VarB.c()) {
            rm8 rm8VarD = um8VarB.c.d(1);
            rm8VarD.getClass();
            arrayList.add(rm8VarD.a);
            if (um8VarB.b().a > i) {
                String strQuote = Pattern.quote(str.substring(i, um8VarB.b().a));
                strQuote.getClass();
                sb.append(strQuote);
            }
            sb.append(q.c());
            i = um8VarB.b().b + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, ca9 ca9Var) {
        if (ca9Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            ub9 ub9Var = ca9Var.a;
            str.getClass();
            ub9Var.e(bundle, str, ub9Var.d(str2));
        }
    }

    public static String h(String str) {
        if (v4e.F(str, "\\Q", false) && v4e.F(str, "\\E", false)) {
            return c5e.A(str, q6.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q");
        }
        return v4e.F(str, "\\.\\*", false) ? c5e.A(str, "\\.\\*", q6.DEFAULT_PROPAGATION_TARGETS) : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.a);
        uri2.getClass();
        return s72.A0(pathSegments, uri2.getPathSegments()).size();
    }

    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            x72.g0(arrayList, ((ra9) it.next()).b);
        }
        return s72.Q0(s72.Q0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        um8 um8VarE;
        um8 um8VarE2;
        String strDecode;
        uri.getClass();
        rob robVar = (rob) this.d.getValue();
        if (robVar != null && (um8VarE = robVar.e(uri.toString())) != null) {
            Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
            if (e(um8VarE, bundleR, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundleR, linkedHashMap))) {
                String fragment = uri.getFragment();
                rob robVar2 = (rob) this.k.getValue();
                if (robVar2 != null && (um8VarE2 = robVar2.e(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(t72.u(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            t72.Z();
                            throw null;
                        }
                        String str = (String) obj;
                        rm8 rm8VarD = um8VarE2.c.d(i2);
                        if (rm8VarD != null) {
                            strDecode = Uri.decode(rm8VarD.a);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleR, str, strDecode, (ca9) linkedHashMap.get(str));
                            arrayList.add(wef.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (y7h.A(linkedHashMap, new qa9(0, bundleR)).isEmpty()) {
                    return bundleR;
                }
            }
        }
        return null;
    }

    public final boolean e(um8 um8Var, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            String strDecode = null;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            String str = (String) obj;
            rm8 rm8VarD = um8Var.c.d(i2);
            if (rm8VarD != null) {
                strDecode = Uri.decode(rm8VarD.a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (ca9) linkedHashMap.get(str));
                arrayList2.add(wef.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof sa9)) {
            return false;
        }
        return this.a.equals(((sa9) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.LinkedHashMap] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            ra9 ra9Var = (ra9) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = t72.H(query);
            }
            Object obj = wef.a;
            boolean z2 = false;
            Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
            for (String str2 : ra9Var.b) {
                ca9 ca9Var = (ca9) linkedHashMap.get(str2);
                ub9 ub9Var = ca9Var != null ? ca9Var.a : null;
                if ((ub9Var instanceof r72) && !ca9Var.c) {
                    r72 r72Var = (r72) ub9Var;
                    r72Var.e(bundleR, str2, r72Var.h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = ra9Var.a;
                um8 um8VarE = str4 != null ? new rob(str4).e(str3) : null;
                if (um8VarE == null) {
                    return z2;
                }
                ArrayList arrayList = ra9Var.b;
                ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                ?? r14 = z2;
                for (Object obj2 : arrayList) {
                    int i = r14 + 1;
                    if (r14 < 0) {
                        t72.Z();
                        throw null;
                    }
                    String str5 = (String) obj2;
                    rm8 rm8VarD = um8VarE.c.d(i);
                    String str6 = rm8VarD != null ? rm8VarD.a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    ca9 ca9Var2 = (ca9) linkedHashMap.get(str5);
                    try {
                        str5.getClass();
                        if (bundleR.containsKey(str5)) {
                            if (bundleR.containsKey(str5)) {
                                if (ca9Var2 != null) {
                                    ub9 ub9Var2 = ca9Var2.a;
                                    Object objA = ub9Var2.a(str5, bundleR);
                                    if (!bundleR.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    ub9Var2.e(bundleR, str5, ub9Var2.c(objA, str6));
                                    objValueOf = obj;
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = obj;
                            }
                        } else {
                            g(bundleR, str5, str6, ca9Var2);
                            objValueOf = obj;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList2.add(objValueOf);
                    r14 = i;
                    z2 = false;
                }
            }
            bundle.putAll(bundleR);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
