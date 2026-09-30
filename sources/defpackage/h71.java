package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h71 implements wtd {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public h71(int i) {
        this.a = 10;
        this.b = 2;
        this.c = i;
    }

    public int a() {
        int i = this.c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void b(flb flbVar) {
        View view = flbVar.a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    @Override // defpackage.wtd
    public int getBeginIndex() {
        return this.b;
    }

    @Override // defpackage.wtd
    public int getEndIndex() {
        return this.c;
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return kv2.h(this.b, this.c, "Span{beginIndex=", ", endIndex=", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h71(int i, byte b) {
        this.a = i;
    }

    public /* synthetic */ h71(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
