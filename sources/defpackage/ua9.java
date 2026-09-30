package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ua9 {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final a80 b;
    public ya9 c;
    public final fud d;

    static {
        new LinkedHashMap();
    }

    public ua9(fc9 fc9Var) {
        LinkedHashMap linkedHashMap = gc9.b;
        this.a = od4.t(fc9Var.getClass());
        this.b = new a80(this);
        this.d = new fud(0);
    }

    public final Bundle c(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b.e;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((ca9) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            bundleR.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                ca9 ca9Var = (ca9) entry2.getValue();
                boolean z = ca9Var.d;
                ub9 ub9Var = ca9Var.a;
                if (!z) {
                    str2.getClass();
                    if (ca9Var.b || !bundleR.containsKey(str2) || !fdc.r(str2, bundleR)) {
                        try {
                            ub9Var.a(str2, bundleR);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    ho7.v(tec.p("Wrong argument type for '", str2, "' in argument savedState. "), ub9Var.b(), " expected.");
                    return null;
                }
            }
        }
        return bundleR;
    }

    public final Map d() {
        return bm8.X((LinkedHashMap) this.b.e);
    }

    public final boolean e(String str, Bundle bundle) {
        str.getClass();
        a80 a80Var = this.b;
        a80Var.getClass();
        if (pa7.t((String) a80Var.f, str)) {
            return true;
        }
        ta9 ta9VarT = a80Var.t(str);
        if (!((ua9) a80Var.c).equals(ta9VarT != null ? ta9VarT.a : null)) {
            return false;
        }
        Bundle bundle2 = ta9VarT.b;
        if (bundle == null || bundle2 == null) {
            return false;
        }
        Set<String> setKeySet = bundle2.keySet();
        setKeySet.getClass();
        for (String str2 : setKeySet) {
            str2.getClass();
            if (!bundle.containsKey(str2)) {
                return false;
            }
            ca9 ca9Var = (ca9) ta9VarT.a.d().get(str2);
            ub9 ub9Var = ca9Var != null ? ca9Var.a : null;
            Object objA = ub9Var != null ? ub9Var.a(str2, bundle2) : null;
            Object objA2 = ub9Var != null ? ub9Var.a(str2, bundle) : null;
            if (ub9Var != null && !ub9Var.g(objA, objA2)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof ua9)) {
                a80 a80Var = this.b;
                ArrayList arrayList = (ArrayList) a80Var.d;
                ua9 ua9Var = (ua9) obj;
                fud fudVar = ua9Var.d;
                a80 a80Var2 = ua9Var.b;
                boolean zEquals = arrayList.equals((ArrayList) a80Var2.d);
                fud fudVar2 = this.d;
                if (fudVar2.d() != fudVar.d()) {
                    z = false;
                    break;
                }
                Iterator it = ((el2) fyc.p(new gud(fudVar2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!pa7.t(abg.q(fudVar2, iIntValue), abg.q(fudVar, iIntValue))) {
                        z = false;
                        break;
                    }
                }
                if (d().size() != ua9Var.d().size()) {
                    z2 = false;
                    break;
                }
                Iterator it2 = ((Iterable) s72.m0(d().entrySet()).b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!ua9Var.d().containsKey(entry.getKey()) || !pa7.t(ua9Var.d().get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (a80Var.b != a80Var2.b || !pa7.t((String) a80Var.f, (String) a80Var2.f) || !zEquals || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public ta9 f(gg7 gg7Var) {
        boolean zG;
        rob robVar;
        um8 um8VarE;
        a80 a80Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) a80Var.e;
        Uri uri = (Uri) gg7Var.b;
        ArrayList<sa9> arrayList = (ArrayList) a80Var.d;
        if (arrayList.isEmpty()) {
            return null;
        }
        ta9 ta9Var = null;
        for (sa9 sa9Var : arrayList) {
            sa9Var.getClass();
            ace aceVar = sa9Var.d;
            if (((rob) aceVar.getValue()) == null) {
                zG = true;
            } else if (uri == null) {
                zG = false;
            } else {
                rob robVar2 = (rob) aceVar.getValue();
                robVar2.getClass();
                zG = robVar2.g(uri.toString());
            }
            if (zG) {
                Bundle bundleD = uri != null ? sa9Var.d(uri, linkedHashMap) : null;
                int iB = sa9Var.b(uri);
                String str = (String) gg7Var.c;
                boolean z = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z) {
                        Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                        if (uri != null && (robVar = (rob) aceVar.getValue()) != null && (um8VarE = robVar.e(uri.toString())) != null) {
                            sa9Var.e(um8VarE, bundleR, linkedHashMap);
                            if (((Boolean) sa9Var.e.getValue()).booleanValue()) {
                                sa9Var.f(uri, bundleR, linkedHashMap);
                            }
                        }
                        if (y7h.A(linkedHashMap, new qa9(1, bundleR)).isEmpty()) {
                        }
                    }
                }
                ta9 ta9Var2 = new ta9((ua9) a80Var.c, bundleD, sa9Var.l, iB, z);
                if (ta9Var == null || ta9Var2.compareTo(ta9Var) > 0) {
                    ta9Var = ta9Var2;
                }
            }
        }
        return ta9Var;
    }

    public int hashCode() {
        a80 a80Var = this.b;
        int i = a80Var.b * 31;
        String str = (String) a80Var.f;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = ((ArrayList) a80Var.d).iterator();
        while (it.hasNext()) {
            iHashCode = (((sa9) it.next()).a.hashCode() + (iHashCode * 31)) * 961;
        }
        fud fudVar = this.d;
        fudVar.getClass();
        if (fudVar.d() > 0) {
            fudVar.e(0).getClass();
            r3.f();
            return 0;
        }
        for (String str2 : d().keySet()) {
            int iC = ub3.c(iHashCode * 31, 31, str2);
            Object obj = d().get(str2);
            iHashCode = iC + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(0x");
        a80 a80Var = this.b;
        a80Var.getClass();
        sb.append(Integer.toHexString(a80Var.b));
        sb.append(")");
        String str = (String) a80Var.f;
        if (str != null && !v4e.Q(str)) {
            sb.append(" route=");
            sb.append((String) a80Var.f);
        }
        return sb.toString();
    }
}
