package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f88 implements View.OnTouchListener {
    public final /* synthetic */ g88 a;

    public f88(g88 g88Var) {
        this.a = g88Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g88 g88Var = this.a;
        c88 c88Var = g88Var.F0;
        Handler handler = g88Var.J0;
        z80 z80Var = g88Var.N0;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && z80Var != null && z80Var.isShowing() && x >= 0 && x < z80Var.getWidth() && y >= 0 && y < z80Var.getHeight()) {
            handler.postDelayed(c88Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(c88Var);
        return false;
    }
}
