package defpackage;

import android.content.ClipData;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mx1 implements u47, cjb {
    public final int a;
    public String b;

    public mx1(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        qc0.j("maxCharacters must be positive");
        throw null;
    }

    @Override // defpackage.u47
    public final void a(une uneVar) {
        q0a q0aVar = uneVar.c;
        vne vneVar = uneVar.a;
        String str = this.b;
        this.b = null;
        boolean z = false;
        if (str != null) {
            CharSequence charSequence = vneVar.c;
            long j = vneVar.d;
            int iG = eue.g(j);
            int iF = eue.f(j);
            charSequence.getClass();
            StringBuilder sb = new StringBuilder(str.length() + (charSequence.length() - (iF - iG)));
            sb.append(charSequence, 0, iG);
            sb.append(str);
            sb.append(charSequence, iF, charSequence.length());
            if (c5e.t(q0aVar, sb.toString())) {
                z = true;
            }
        }
        int length = vneVar.c.length();
        int length2 = q0aVar.length();
        int i = this.a;
        if (length2 <= i) {
            return;
        }
        if (length > i) {
            if (length2 <= length) {
                return;
            }
        } else if (z) {
            return;
        }
        uneVar.e();
    }

    @Override // defpackage.cjb
    public final sug d(sug sugVar) throws IOException {
        int i = sugVar.b;
        String strD0 = null;
        if (i == 2 || i == 1) {
            ClipData clipData = ((a52) sugVar.c).a;
            c78 c78VarW = t72.w();
            int itemCount = clipData.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    c78VarW.add(text);
                }
            }
            c78 c78VarN = c78VarW.n();
            c78 c78Var = !c78VarN.isEmpty() ? c78VarN : null;
            if (c78Var != null) {
                strD0 = s72.D0(c78Var, "\n", null, null, null, 62);
            }
        }
        this.b = strD0;
        return sugVar;
    }
}
