package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o94 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public zi0 g;
    public int h;
    public long i;
    public final /* synthetic */ w94 j;

    public o94(w94 w94Var, String str) {
        str.getClass();
        this.j = w94Var;
        this.a = str;
        w94Var.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.j.a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.j.a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final q94 a() {
        TimeZone timeZone = keg.a;
        if (!this.e) {
            return null;
        }
        w94 w94Var = this.j;
        if (!w94Var.z && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                mtd mtdVarH0 = w94Var.b.h0((e1a) this.c.get(i));
                if (!w94Var.z) {
                    this.h++;
                    mtdVarH0 = new n94(mtdVarH0, w94Var, this);
                }
                arrayList.add(mtdVarH0);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ieg.b((mtd) it.next());
                }
                try {
                    w94Var.W(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new q94(this.j, this.a, this.i, arrayList, jArr);
    }
}
