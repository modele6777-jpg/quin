package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gh2 implements as5 {
    public final /* synthetic */ int a;
    public final Object b;

    public gh2(String str) {
        this.a = 2;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.as5
    public final void a(Object obj, StringBuilder sb, boolean z) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    ((as5) it.next()).a(obj, sb, z);
                }
                break;
            case 1:
                for (iy9 iy9Var : (List) obj2) {
                    a26 a26Var = (a26) iy9Var.a();
                    as5 as5Var = (as5) iy9Var.b();
                    if (((Boolean) a26Var.d(obj)).booleanValue()) {
                        as5Var.a(obj, sb, z);
                        break;
                    }
                }
                break;
            case 2:
                sb.append((CharSequence) obj2);
                break;
            default:
                sb.append((CharSequence) ((vx7) obj2).d(obj));
                break;
        }
    }

    public /* synthetic */ gh2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
