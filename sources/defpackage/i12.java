package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i12 {
    public int a;
    public int b;
    public int d = 7;
    public int[] c = new int[8];

    public void a(int i) {
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.b = i3;
        int i4 = this.a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.c, 0, iArr2, i5, this.a);
            this.c = iArr2;
            this.a = 0;
            this.b = length;
            this.d = i6 - 1;
        }
    }

    public void b(int i, int i2) {
        if (i < 0) {
            qc0.j("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            qc0.j("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        tkb tkbVar = recyclerView.E0;
        if (recyclerView.z == null || tkbVar == null || !tkbVar.h) {
            return;
        }
        if (z) {
            if (((ArrayList) recyclerView.e.b).size() <= 0) {
                tkbVar.h(recyclerView.z.a(), this);
            }
        } else if (!recyclerView.I()) {
            tkbVar.g(this.a, this.b, recyclerView.s1, this);
        }
        int i = this.d;
        if (i > tkbVar.i) {
            tkbVar.i = i;
            tkbVar.j = z;
            recyclerView.c.r();
        }
    }
}
