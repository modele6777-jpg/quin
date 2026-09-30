package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.sig.r3;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xdh {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public xdh(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oeh oehVar = (oeh) it.next();
            if (TextUtils.isEmpty(oehVar.d())) {
                b1.l("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                oeh oehVar2 = (oeh) this.a.put(oehVar.d(), oehVar);
                if (oehVar2 != null) {
                    String canonicalName = oehVar2.getClass().getCanonicalName();
                    String canonicalName2 = oehVar.getClass().getCanonicalName();
                    qc0.j(ks0.m(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw kv2.g(it2);
        }
        this.c.addAll(list);
    }

    public final Object a(Uri uri, wdh wdhVar) {
        return wdhVar.c(b(uri));
    }

    public final vdh b(Uri uri) throws heh {
        List listG;
        dy6 dy6VarM = jy6.m();
        dy6 dy6VarM2 = jy6.m();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listG = yob.e;
        } else {
            String strSubstring = encodedFragment.substring(10);
            j27 j27VarC = j27.c("+");
            Iterable bvdVar = new bvd(new j27((cvd) j27VarC.d, true, (cx1) j27VarC.c, j27VarC.b), strSubstring);
            if (bvdVar instanceof Collection) {
                listG = jy6.o((Collection) bvdVar);
            } else {
                Iterator it = bvdVar.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        dy6 dy6Var = new dy6(4);
                        dy6Var.b(next);
                        while (it.hasNext()) {
                            dy6Var.b(it.next());
                        }
                        listG = dy6Var.g();
                    } else {
                        listG = jy6.s(next);
                    }
                } else {
                    listG = yob.e;
                }
            }
        }
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            String str = (String) listG.get(i);
            Matcher matcher = meh.a.matcher(str);
            if (!matcher.matches()) {
                qc0.j("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            dy6VarM2.b(matcher.group(1));
        }
        yob yobVarG = dy6VarM2.g();
        if (yobVarG.d > 0) {
            String str2 = (String) yobVarG.get(0);
            if (this.b.get(str2) != null) {
                r3.f();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            throw new heh(ks0.m(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
        }
        jy6 jy6VarW = dy6VarM.g().w();
        vdh vdhVar = new vdh();
        String scheme = uri.getScheme();
        oeh oehVar = (oeh) this.a.get(scheme);
        if (oehVar == null) {
            throw new heh(ub3.i("Requested backend isn't registered: ", scheme));
        }
        vdhVar.a = oehVar;
        vdhVar.c = this.c;
        vdhVar.b = jy6VarW;
        if (!jy6VarW.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = jy6VarW.listIterator(jy6VarW.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        r3.f();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        vdhVar.d = uri;
        vdh vdhVar2 = new vdh();
        vdhVar2.a = vdhVar.a;
        vdhVar2.b = vdhVar.b;
        vdhVar2.c = vdhVar.c;
        vdhVar2.d = vdhVar.d;
        return vdhVar2;
    }
}
