package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m4d extends CharacterStyle implements UpdateAppearance {
    public final l4d a;
    public final float b;
    public final vz9 c = q1c.f(new ald(9205357640488583168L));
    public final mx3 d = zrd.b(new hla(23, this));

    public m4d(l4d l4dVar, float f) {
        this.a = l4dVar;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        tq.N(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
