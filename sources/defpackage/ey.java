package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ey extends gu7 implements a26 {
    final /* synthetic */ jsd $currentlyVisible;
    final /* synthetic */ uy $rootScope;
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(jsd jsdVar, Object obj, uy uyVar) {
        super(1);
        this.$currentlyVisible = jsdVar;
        this.$stateForContent = obj;
        this.$rootScope = uyVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new z6(this.$currentlyVisible, this.$stateForContent, this.$rootScope, 1);
    }
}
