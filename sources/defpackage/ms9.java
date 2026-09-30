package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ms9 extends gt4 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms9(tkb tkbVar, int i) {
        super(tkbVar);
        this.d = i;
    }

    @Override // defpackage.gt4
    public final int d(View view) {
        int right;
        int i;
        switch (this.d) {
            case 0:
                ukb ukbVar = (ukb) view.getLayoutParams();
                right = view.getRight() + ((ukb) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ukbVar).rightMargin;
                break;
            default:
                ukb ukbVar2 = (ukb) view.getLayoutParams();
                right = view.getBottom() + ((ukb) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ukbVar2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.gt4
    public final int e(View view) {
        int measuredWidth;
        int i;
        switch (this.d) {
            case 0:
                ukb ukbVar = (ukb) view.getLayoutParams();
                Rect rect = ((ukb) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) ukbVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) ukbVar).rightMargin;
                break;
            default:
                ukb ukbVar2 = (ukb) view.getLayoutParams();
                Rect rect2 = ((ukb) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) ukbVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) ukbVar2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // defpackage.gt4
    public final int f(View view) {
        int measuredHeight;
        int i;
        switch (this.d) {
            case 0:
                ukb ukbVar = (ukb) view.getLayoutParams();
                Rect rect = ((ukb) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) ukbVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) ukbVar).bottomMargin;
                break;
            default:
                ukb ukbVar2 = (ukb) view.getLayoutParams();
                Rect rect2 = ((ukb) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) ukbVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) ukbVar2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.gt4
    public final int g(View view) {
        int left;
        int i;
        switch (this.d) {
            case 0:
                ukb ukbVar = (ukb) view.getLayoutParams();
                left = view.getLeft() - ((ukb) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ukbVar).leftMargin;
                break;
            default:
                ukb ukbVar2 = (ukb) view.getLayoutParams();
                left = view.getTop() - ((ukb) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ukbVar2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.gt4
    public final int h() {
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((tkb) obj).m;
            default:
                return ((tkb) obj).n;
        }
    }

    @Override // defpackage.gt4
    public final int i() {
        int i;
        int iZ;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                tkb tkbVar = (tkb) obj;
                i = tkbVar.m;
                iZ = tkbVar.z();
                break;
            default:
                tkb tkbVar2 = (tkb) obj;
                i = tkbVar2.n;
                iZ = tkbVar2.x();
                break;
        }
        return i - iZ;
    }

    @Override // defpackage.gt4
    public final int j() {
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((tkb) obj).z();
            default:
                return ((tkb) obj).x();
        }
    }

    @Override // defpackage.gt4
    public final int k() {
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((tkb) obj).k;
            default:
                return ((tkb) obj).l;
        }
    }

    @Override // defpackage.gt4
    public final int l() {
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((tkb) obj).l;
            default:
                return ((tkb) obj).k;
        }
    }

    @Override // defpackage.gt4
    public final int m() {
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((tkb) obj).y();
            default:
                return ((tkb) obj).A();
        }
    }

    @Override // defpackage.gt4
    public final int n() {
        int iY;
        int iZ;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                tkb tkbVar = (tkb) obj;
                iY = tkbVar.m - tkbVar.y();
                iZ = tkbVar.z();
                break;
            default:
                tkb tkbVar2 = (tkb) obj;
                iY = tkbVar2.n - tkbVar2.A();
                iZ = tkbVar2.x();
                break;
        }
        return iY - iZ;
    }

    @Override // defpackage.gt4
    public final int o(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((tkb) obj2).E(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((tkb) obj2).E(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.gt4
    public final int p(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((tkb) obj2).E(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((tkb) obj2).E(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.gt4
    public final void q(int i) {
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((tkb) obj).I(i);
                break;
            default:
                ((tkb) obj).J(i);
                break;
        }
    }
}
