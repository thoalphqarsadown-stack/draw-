package com.example.ui

import androidx.lifecycle.ViewModel
import com.example.model.RepositoryInfo
import com.example.model.ZolavorTab
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class ZolavorUiState(
    val selectedTab: ZolavorTab = ZolavorTab.OVERVIEW,
    val repositoryInfo: RepositoryInfo = RepositoryInfo()
)

class ZolavorViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(ZolavorUiState())
    val uiState: StateFlow<ZolavorUiState> = _uiState.asStateFlow()

    fun selectTab(tab: ZolavorTab) {
        _uiState.update { it.copy(selectedTab = tab) }
    }
}
