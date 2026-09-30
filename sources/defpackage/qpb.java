package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qpb extends gbe implements l26 {
    final /* synthetic */ uh8 $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpb(uh8 uh8Var, Context context, String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$composition = uh8Var;
        this.$context = context;
        this.$fontAssetsFolder = str;
        this.$fontFileExtension = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qpb(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        for (up5 up5Var : this.$composition.f.values()) {
            Context context = this.$context;
            up5Var.getClass();
            String str = up5Var.a;
            String str2 = this.$fontAssetsFolder;
            String str3 = this.$fontFileExtension;
            String str4 = up5Var.c;
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), ub3.j(str2, str, str3));
                try {
                    typefaceCreateFromAsset.getClass();
                    str4.getClass();
                    int i = 0;
                    boolean zF = v4e.F(str4, "Italic", false);
                    boolean zF2 = v4e.F(str4, "Bold", false);
                    if (zF && zF2) {
                        i = 3;
                    } else if (zF) {
                        i = 2;
                    } else if (zF2) {
                        i = 1;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                    }
                    up5Var.d = typefaceCreateFromAsset;
                } catch (Exception unused) {
                    gf8.a.getClass();
                }
            } catch (Exception unused2) {
                gf8.a.getClass();
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        qpb qpbVar = (qpb) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        qpbVar.r(wefVar);
        return wefVar;
    }
}
