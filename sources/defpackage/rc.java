package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rc extends View {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override // android.view.View
    public int getWindowSystemUiVisibility() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return super.getWindowSystemUiVisibility();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                int i3 = (int) (80.0f * getResources().getDisplayMetrics().density);
                setMeasuredDimension(i3, i3);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }
}
