package defpackage;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d55 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public d55(int i) {
        this.b = i;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = (byte[]) this.f;
            int length = bArrCopyOf.length;
            int i4 = this.c + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 * 2);
                this.f = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.c, i3);
            this.c += i3;
        }
    }

    public void b() {
        boolean z = this.d;
        gt4 gt4Var = (gt4) this.f;
        this.c = z ? gt4Var.i() : gt4Var.m();
    }

    public void c(View view, int i) {
        gt4 gt4Var = (gt4) this.f;
        int iN = Integer.MIN_VALUE == gt4Var.a ? 0 : gt4Var.n() - gt4Var.a;
        if (iN >= 0) {
            boolean z = this.d;
            gt4 gt4Var2 = (gt4) this.f;
            if (z) {
                int iD = gt4Var2.d(view);
                gt4 gt4Var3 = (gt4) this.f;
                this.c = (Integer.MIN_VALUE != gt4Var3.a ? gt4Var3.n() - gt4Var3.a : 0) + iD;
            } else {
                this.c = gt4Var2.g(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        gt4 gt4Var4 = (gt4) this.f;
        if (!z2) {
            int iG = gt4Var4.g(view);
            int iM = iG - ((gt4) this.f).m();
            this.c = iG;
            if (iM > 0) {
                int i2 = (((gt4) this.f).i() - Math.min(0, (((gt4) this.f).i() - iN) - ((gt4) this.f).d(view))) - (((gt4) this.f).e(view) + iG);
                if (i2 < 0) {
                    this.c -= Math.min(iM, -i2);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = (gt4Var4.i() - iN) - ((gt4) this.f).d(view);
        this.c = ((gt4) this.f).i() - i3;
        if (i3 > 0) {
            int iE = this.c - ((gt4) this.f).e(view);
            int iM2 = ((gt4) this.f).m();
            int iMin = iE - (Math.min(((gt4) this.f).g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(i3, -iMin) + this.c;
            }
        }
    }

    public boolean d(int i) {
        if (!this.d) {
            return false;
        }
        this.c -= i;
        this.d = false;
        this.e = true;
        return true;
    }

    public void e(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void f() {
        switch (this.a) {
            case 1:
                this.b = -1;
                this.c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                break;
            default:
                this.d = false;
                this.e = false;
                break;
        }
    }

    public void g(int i) {
        pa7.J(!this.d);
        boolean z = i == this.b;
        this.d = z;
        if (z) {
            this.c = 3;
            this.e = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public d55(mga mgaVar) {
        this.f = mgaVar;
    }

    public d55() {
        f();
    }
}
