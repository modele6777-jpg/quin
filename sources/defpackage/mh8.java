package defpackage;

import android.graphics.Typeface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mh8 extends gu7 implements l26 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ yi $alignment;
    final /* synthetic */ boolean $applyOpacityToLayers;
    final /* synthetic */ boolean $applyShadowToLayers;
    final /* synthetic */ jh0 $asyncUpdates;
    final /* synthetic */ th8 $clipSpec;
    final /* synthetic */ boolean $clipTextToBoundingBox;
    final /* synthetic */ boolean $clipToCompositionBounds;
    final /* synthetic */ uh8 $composition;
    final /* synthetic */ bn2 $contentScale;
    final /* synthetic */ pi8 $dynamicProperties;
    final /* synthetic */ boolean $enableMergePaths;
    final /* synthetic */ Map<String, Typeface> $fontMap;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $maintainOriginalImageBounds;
    final /* synthetic */ j09 $modifier;
    final /* synthetic */ boolean $outlineMasksAndMattes;
    final /* synthetic */ rqb $renderMode;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $safeMode;
    final /* synthetic */ float $speed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh8(uh8 uh8Var, j09 j09Var, boolean z, boolean z2, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, rqb rqbVar, boolean z7, boolean z8, yi yiVar, bn2 bn2Var, boolean z9, boolean z10, Map map, boolean z11, jh0 jh0Var, int i2, int i3, int i4, int i5) {
        super(2);
        this.$composition = uh8Var;
        this.$modifier = j09Var;
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$speed = f;
        this.$iterations = i;
        this.$outlineMasksAndMattes = z3;
        this.$applyOpacityToLayers = z4;
        this.$applyShadowToLayers = z5;
        this.$enableMergePaths = z6;
        this.$renderMode = rqbVar;
        this.$reverseOnRepeat = z7;
        this.$maintainOriginalImageBounds = z8;
        this.$alignment = yiVar;
        this.$contentScale = bn2Var;
        this.$clipToCompositionBounds = z9;
        this.$clipTextToBoundingBox = z10;
        this.$fontMap = map;
        this.$safeMode = z11;
        this.$asyncUpdates = jh0Var;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$changed2 = i4;
        this.$$default = i5;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        mh3.f(this.$composition, this.$modifier, this.$isPlaying, this.$restartOnPlay, this.$speed, this.$iterations, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$applyShadowToLayers, this.$enableMergePaths, this.$renderMode, this.$reverseOnRepeat, this.$maintainOriginalImageBounds, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$safeMode, this.$asyncUpdates, (l46) obj, k99.P(this.$$changed | 1), k99.P(this.$$changed1), k99.P(this.$$changed2), this.$$default);
        return wef.a;
    }
}
