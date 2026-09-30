package defpackage;

import com.adjust.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ct6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public ct6(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(v4e.N(str, ':', length, 4) + 1, v4e.N(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iN = v4e.N(str, '/', length, 4);
        return str.substring(iN, ieg.f(str, iN, "?#", str.length()));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iN = v4e.N(str, '/', length, 4);
        int iF = ieg.f(str, iN, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (iN < iF) {
            int i = iN + 1;
            int iE = ieg.e(str, '/', i, iF);
            arrayList.add(str.substring(i, iE));
            iN = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iN = v4e.N(str, '?', 0, 6) + 1;
        return str.substring(iN, ieg.e(str, '#', iN, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, ieg.f(str, length, ":@", str.length()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ct6) && ((ct6) obj).i.equals(this.i);
    }

    public final boolean f() {
        return pa7.t(this.a, Constants.SCHEME);
    }

    public final bt6 g() {
        int i;
        bt6 bt6Var = new bt6();
        String str = this.a;
        bt6Var.e = str;
        bt6Var.f = e();
        bt6Var.g = a();
        bt6Var.h = this.d;
        str.getClass();
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals(Constants.SCHEME) ? 443 : -1;
        }
        int i2 = this.e;
        bt6Var.d = i2 != i ? i2 : -1;
        ArrayList arrayList = bt6Var.b;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        bt6Var.c = strD != null ? bt6.e(n16.x(0, 0, 83, strD, " \"'<>#")) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(v4e.N(str2, '#', 0, 6) + 1);
        }
        bt6Var.i = strSubstring;
        return bt6Var;
    }

    public final String h(String str) {
        List list = this.g;
        if (list == null) {
            return null;
        }
        x67 x67VarX = mh3.X(mh3.c0(0, list.size()), 2);
        int i = x67VarX.a;
        int i2 = x67VarX.b;
        int i3 = x67VarX.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!str.equals(list.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return (String) list.get(i + 1);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        bt6 bt6Var;
        try {
            bt6Var = new bt6();
            bt6Var.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            bt6Var = null;
        }
        bt6Var.getClass();
        bt6Var.f = n16.x(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        bt6Var.g = n16.x(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return bt6Var.a().i;
    }

    public final URI j() {
        bt6 bt6VarG = g();
        ArrayList arrayList = bt6VarG.b;
        String str = (String) bt6VarG.h;
        bt6VarG.h = str != null ? new rob("[\"<>^`{|}]").h(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, n16.x(0, 0, 99, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = bt6VarG.c;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? n16.x(0, 0, 67, str2, "\\^`{|}") : null);
            }
        }
        String str3 = (String) bt6VarG.i;
        bt6VarG.i = str3 != null ? n16.x(0, 0, 35, str3, " \"#<>\\^`{|}") : null;
        String string = bt6VarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new rob("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").h(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                yg5.p(e);
                return null;
            }
        }
    }

    public final URL k() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            yg5.p(e);
            return null;
        }
    }

    public final String toString() {
        return this.i;
    }
}
