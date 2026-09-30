package defpackage;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zha implements xga, View.OnClickListener, nha, eha {
    public final eye a = new eye();
    public Object b;
    public final /* synthetic */ PlayerView c;

    public zha(PlayerView playerView) {
        this.c = playerView;
    }

    @Override // defpackage.xga
    public final void E(int i, int i2) {
        PlayerView playerView = this.c;
        View view = playerView.d;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.X0) {
            cia ciaVar = playerView.f;
            ciaVar.getClass();
            playerView.G0.post(new c0(ciaVar, (SurfaceView) view, new m45(15, playerView), 23));
        }
    }

    @Override // defpackage.xga
    public final void a(uuf uufVar) {
        PlayerView playerView;
        zga zgaVar;
        if (uufVar.equals(uuf.d) || (zgaVar = (playerView = this.c).K0) == null || ((y45) zgaVar).r() == 1) {
            return;
        }
        playerView.j();
    }

    @Override // defpackage.xga
    public final void h(int i, boolean z) {
        int i2 = PlayerView.Y0;
        PlayerView playerView = this.c;
        playerView.k();
        if (!playerView.c() || !playerView.V0) {
            playerView.e(false);
            return;
        }
        oha ohaVar = playerView.z;
        if (ohaVar != null) {
            ohaVar.f();
        }
    }

    @Override // defpackage.xga
    public final void l(int i) {
        int i2 = PlayerView.Y0;
        PlayerView playerView = this.c;
        playerView.k();
        playerView.m();
        if (!playerView.c() || !playerView.V0) {
            playerView.e(false);
            return;
        }
        oha ohaVar = playerView.z;
        if (ohaVar != null) {
            ohaVar.f();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.Y0;
        this.c.i();
    }

    @Override // defpackage.xga
    public final void p(u03 u03Var) {
        SubtitleView subtitleView = this.c.w;
        if (subtitleView != null) {
            subtitleView.setCues(u03Var.a);
        }
    }

    @Override // defpackage.xga
    public final void r(f2f f2fVar) {
        PlayerView playerView = this.c;
        zga zgaVar = playerView.K0;
        zgaVar.getClass();
        y45 y45Var = (y45) zgaVar;
        gye gyeVarM = y45Var.v(17) ? y45Var.m() : gye.a;
        if (gyeVarM.p()) {
            this.b = null;
        } else {
            boolean zV = y45Var.v(30);
            eye eyeVar = this.a;
            if (!zV || y45Var.n().a.isEmpty()) {
                Object obj = this.b;
                if (obj != null) {
                    int iB = gyeVarM.b(obj);
                    if (iB != -1) {
                        if (y45Var.i() == gyeVarM.f(iB, eyeVar, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = gyeVarM.f(y45Var.j(), eyeVar, true).b;
            }
        }
        playerView.n(false);
    }

    @Override // defpackage.xga
    public final void t(int i, yga ygaVar, yga ygaVar2) {
        oha ohaVar;
        int i2 = PlayerView.Y0;
        PlayerView playerView = this.c;
        if (playerView.c() && playerView.V0 && (ohaVar = playerView.z) != null) {
            ohaVar.f();
        }
    }

    @Override // defpackage.xga
    public final void x() {
        PlayerView playerView = this.c;
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.a()) {
                playerView.b();
                return;
            }
            ImageView imageView = playerView.g;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }
}
