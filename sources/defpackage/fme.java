package defpackage;

import ai.askquin.repository.b;
import tech.chatmind.api.TemplateCategory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fme extends gcg {
    public final k5b d;
    public final b e;
    public final bme f;
    public final boolean g;
    public final vz9 v;
    public final vz9 w;

    public fme(k5b k5bVar, bme bmeVar, b bVar) {
        this.d = k5bVar;
        this.e = bVar;
        bme yleVar = bmeVar == null ? new yle(TemplateCategory.GENERAL) : bmeVar;
        this.f = yleVar;
        if (yleVar instanceof yle) {
            qle qleVar = TemplateCategory.Companion;
        }
        this.g = bmeVar != null && (bmeVar instanceof yle);
        this.v = q1c.f(null);
        this.w = q1c.f(5);
        f(new eme(this, null));
    }
}
