package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b57 extends h72 implements Runnable, lm9, View.OnAttachStateChangeListener {
    public final m8g c;
    public boolean d;
    public boolean e;
    public h8g f;

    public b57(m8g m8gVar) {
        super(!m8gVar.t ? 1 : 0);
        this.c = m8gVar;
    }

    @Override // defpackage.h72
    public final void d(n7g n7gVar) {
        this.d = false;
        this.e = false;
        h8g h8gVar = this.f;
        if (n7gVar.a.b() > 0 && h8gVar != null) {
            e8g e8gVar = h8gVar.a;
            m8g m8gVar = this.c;
            m8gVar.s.f(d8c.t(e8gVar.i(8)));
            m8gVar.r.f(d8c.t(e8gVar.i(8)));
            m8g.b(m8gVar, h8gVar);
        }
        this.f = null;
    }

    @Override // defpackage.h72
    public final void e(n7g n7gVar) {
        this.d = true;
        this.e = true;
    }

    @Override // defpackage.h72
    public final h8g f(h8g h8gVar, List list) {
        m8g m8gVar = this.c;
        m8g.b(m8gVar, h8gVar);
        return m8gVar.t ? h8g.b : h8gVar;
    }

    @Override // defpackage.h72
    public final lqb g(n7g n7gVar, lqb lqbVar) {
        this.d = false;
        return lqbVar;
    }

    @Override // defpackage.lm9
    public final h8g i(View view, h8g h8gVar) {
        this.f = h8gVar;
        m8g m8gVar = this.c;
        trf trfVar = m8gVar.r;
        e8g e8gVar = h8gVar.a;
        trfVar.f(d8c.t(e8gVar.i(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            m8gVar.s.f(d8c.t(e8gVar.i(8)));
            m8g.b(m8gVar, h8gVar);
        }
        return m8gVar.t ? h8g.b : h8gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            h8g h8gVar = this.f;
            if (h8gVar != null) {
                m8g m8gVar = this.c;
                m8gVar.s.f(d8c.t(h8gVar.a.i(8)));
                m8g.b(m8gVar, h8gVar);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
