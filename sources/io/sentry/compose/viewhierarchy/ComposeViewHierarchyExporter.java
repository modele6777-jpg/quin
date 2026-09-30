package io.sentry.compose.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import defpackage.c47;
import defpackage.hkb;
import defpackage.n09;
import defpackage.p89;
import defpackage.vd0;
import defpackage.z7c;
import io.sentry.internal.debugmeta.c;
import io.sentry.protocol.k0;
import io.sentry.util.a;
import io.sentry.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;", "Lio/sentry/z0;", "logger", "<init>", "(Lio/sentry/z0;)V", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = z7c.f)
public final class ComposeViewHierarchyExporter {
    public final z0 a;
    public volatile c b;
    public final a c;

    public ComposeViewHierarchyExporter(z0 z0Var) {
        z0Var.getClass();
        this.a = z0Var;
        this.c = new a();
    }

    public static void a(c cVar, k0 k0Var, LayoutNode layoutNode) {
        if (layoutNode.X()) {
            k0 k0Var2 = new k0();
            Iterator it = layoutNode.D().iterator();
            while (it.hasNext()) {
                String strO = cVar.o(((n09) it.next()).a);
                if (strO != null) {
                    k0Var2.d = strO;
                }
            }
            hkb hkbVarM = vd0.M((c47) layoutNode.V0.d);
            float f = hkbVarM.a;
            k0Var2.g = Double.valueOf(f);
            float f2 = hkbVarM.b;
            k0Var2.v = Double.valueOf(f2);
            k0Var2.f = Double.valueOf(hkbVarM.d - f2);
            k0Var2.e = Double.valueOf(hkbVarM.c - f);
            String str = k0Var2.d;
            if (str == null) {
                str = "@Composable";
            }
            k0Var2.b = str;
            List arrayList = k0Var.y;
            if (arrayList == null) {
                arrayList = new ArrayList();
                k0Var.y = arrayList;
            }
            arrayList.add(k0Var2);
            p89 p89VarK = layoutNode.K();
            int i = p89VarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                a(cVar, k0Var2, (LayoutNode) p89VarK.a[i2]);
            }
        }
    }
}
