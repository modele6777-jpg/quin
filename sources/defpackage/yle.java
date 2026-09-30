package defpackage;

import tech.chatmind.api.TemplateCategory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yle implements bme {
    public final TemplateCategory a;

    public yle(TemplateCategory templateCategory) {
        templateCategory.getClass();
        this.a = templateCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yle) && this.a == ((yle) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FromCategory(category=" + this.a + ")";
    }
}
