package defpackage;

import android.graphics.Typeface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kh8 extends gu7 implements l26 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ yi $alignment;
    final /* synthetic */ boolean $applyOpacityToLayers;
    final /* synthetic */ boolean $applyShadowToLayers;
    final /* synthetic */ jh0 $asyncUpdates;
    final /* synthetic */ boolean $clipTextToBoundingBox;
    final /* synthetic */ boolean $clipToCompositionBounds;
    final /* synthetic */ uh8 $composition;
    final /* synthetic */ bn2 $contentScale;
    final /* synthetic */ pi8 $dynamicProperties;
    final /* synthetic */ boolean $enableMergePaths;
    final /* synthetic */ Map<String, Typeface> $fontMap;
    final /* synthetic */ boolean $maintainOriginalImageBounds;
    final /* synthetic */ j09 $modifier;
    final /* synthetic */ boolean $outlineMasksAndMattes;
    final /* synthetic */ x16 $progress;
    final /* synthetic */ rqb $renderMode;
    final /* synthetic */ boolean $safeMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh8(uh8 uh8Var, x16 x16Var, j09 j09Var, boolean z, boolean z2, boolean z3, boolean z4, rqb rqbVar, boolean z5, yi yiVar, bn2 bn2Var, boolean z6, boolean z7, Map map, jh0 jh0Var, boolean z8, int i, int i2, int i3) {
        super(2);
        this.$composition = uh8Var;
        this.$progress = x16Var;
        this.$modifier = j09Var;
        this.$outlineMasksAndMattes = z;
        this.$applyOpacityToLayers = z2;
        this.$applyShadowToLayers = z3;
        this.$enableMergePaths = z4;
        this.$renderMode = rqbVar;
        this.$maintainOriginalImageBounds = z5;
        this.$alignment = yiVar;
        this.$contentScale = bn2Var;
        this.$clipToCompositionBounds = z6;
        this.$clipTextToBoundingBox = z7;
        this.$fontMap = map;
        this.$asyncUpdates = jh0Var;
        this.$safeMode = z8;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        mh3.e(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$applyShadowToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, (l46) obj, k99.P(this.$$changed | 1), k99.P(this.$$changed1), this.$$default);
        return wef.a;
    }
}
