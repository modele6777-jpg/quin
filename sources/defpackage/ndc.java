package defpackage;

import ai.askquin.R;
import ai.askquin.ui.popup.dailyfortune.b;
import ai.askquin.ui.popup.dailyfortune.v;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ndc {
    public static byte a(long j) {
        pa7.x(j, (j >> 8) == 0, "out of range: %s");
        return (byte) j;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:27:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[LOOP:1: B:15:0x002f->B:28:?, LOOP_END, SYNTHETIC] */
    public static final wy6 b() {
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2 = r74.a.b;
        if (arrayList2.isEmpty()) {
            arrayList = r74.a.b;
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((f9b) it.next()) instanceof zae) {
                    }
                }
            }
            return wy6.EXTERNAL;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (((f9b) it2.next()) instanceof abe) {
            }
        }
        arrayList = r74.a.b;
        if (!arrayList.isEmpty()) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                if (((f9b) it.next()) instanceof zae) {
                }
            }
        }
        return wy6.EXTERNAL;
        return wy6.EMBEDDED;
    }

    public static final ste c(twc twcVar) {
        a26 a26Var;
        ArrayList arrayList = new ArrayList();
        Object objG = twcVar.a.g(swc.a);
        if (objG == null) {
            objG = null;
        }
        f6 f6Var = (f6) objG;
        if (f6Var == null || (a26Var = (a26) f6Var.b) == null || !((Boolean) a26Var.d(arrayList)).booleanValue()) {
            return null;
        }
        return (ste) arrayList.get(0);
    }

    public static final e83 d(d83 d83Var, boolean z, boolean z2) {
        d83Var.getClass();
        int iOrdinal = d83Var.ordinal();
        if (iOrdinal == 0) {
            return new e83(true, false);
        }
        if (iOrdinal == 1) {
            return (z || z2) ? new e83(z, z2) : new e83(true, false);
        }
        if (iOrdinal == 2) {
            return new e83(false, true);
        }
        ap.c();
        return null;
    }

    public static boolean e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = Build.MODEL;
            str2.getClass();
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (c5e.C(upperCase, str, false)) {
                return true;
            }
        }
        return false;
    }

    public static final wj5 f(a26 a26Var) {
        al5 al5Var = new al5(new ybc(new x3e(null, a26Var)), new y3e(3, null));
        js3 js3Var = ga4.a;
        return ym8.x(al5Var, hr3.c);
    }

    public static final Object g(int i, d83 d83Var, v vVar, gbe gbeVar) {
        th5 th5Var = cye.b;
        String string = gcc.E(z57.a.a(), fbc.d()).a().toString();
        if (d83Var != d83.c) {
            if (i > 2) {
                string = null;
            }
            return bsa.p(i, new ab4(string, i), gbeVar);
        }
        if (vVar == null) {
            qc0.p("Required value was null.");
            return null;
        }
        b bVar = new b(4);
        String strF = vVar.f();
        wef wefVar = wef.a;
        Object objU = strF == null ? wefVar : vVar.u(strF, bVar, gbeVar);
        return objU == bw2.a ? objU : wefVar;
    }

    public static final long h(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : y72.b(j, y72.c(j) * f);
    }

    public static final void i(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final AsyncImagePainter j(sw6 sw6Var, l46 l46Var) {
        return z7f.Y(sw6Var, skd.a((Context) l46Var.k(uq.b)), null, l46Var, 0, 0);
    }

    public static final ax k(ex exVar, int i) {
        Object next;
        Iterator<T> it = exVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LayoutNode) ((Map.Entry) next).getKey()).b != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (ax) entry.getValue();
        }
        return null;
    }

    public static final String l(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final void m(int i, String str) {
        x1f x1fVar = x1f.a;
        x1f.k(p05.a, new lce(str, i, 1), 2);
    }

    public static String n(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
