package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u71 {
    public final int a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public u71(int i, String str) {
        this.a = 0;
        this.b = null;
        this.a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(int i, String str, String str2) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(new g71(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<g71> arrayList = this.c;
        if (arrayList != null) {
            for (g71 g71Var : arrayList) {
                sb.append('[');
                String str2 = g71Var.a;
                String str3 = g71Var.c;
                sb.append(str2);
                int iB = kv2.B(g71Var.b);
                if (iB == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (iB == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iB == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList<k71> arrayList2 = this.d;
        if (arrayList2 != null) {
            for (k71 k71Var : arrayList2) {
                sb.append(':');
                sb.append(k71Var);
            }
        }
        return sb.toString();
    }
}
