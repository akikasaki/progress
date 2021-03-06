package com.trump.progress;

import java.util.List;

public interface ProgressBarRepository extends GenericRepo<ProgressBar> {
        List<ProgressBar> findAllByIsActiveIsTrue();
        List<ProgressBar> findAllByIsActiveIsFalse();
}
